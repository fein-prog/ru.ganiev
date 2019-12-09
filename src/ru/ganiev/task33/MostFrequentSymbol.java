package ru.ganiev.task33;

import java.util.*;

public class MostFrequentSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        char[] arr = sc.nextLine().toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (map.containsKey(c)) {
                count = map.get(c) + 1;
                map.put(c, count);
            } else map.put(c, 1);
        }
        System.out.println(map);

        Set<Map.Entry<Character, Integer>> setvalue = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> i = setvalue.iterator();
        Map.Entry<Character, Integer> max = null;
        while (i.hasNext()) {
            Map.Entry<Character, Integer> me = i.next();
            if (max == null) {
                max = me;
            } else if (me.getValue() > max.getValue()) {
                max = me;
            }
        }
        System.out.println("Максимально встречающийся символ в строке: " + max.getKey());
    }
}
