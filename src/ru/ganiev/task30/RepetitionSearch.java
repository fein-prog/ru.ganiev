package ru.ganiev.task30;

import java.util.*;

public class RepetitionSearch {
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

        counter(map);
    }

    private static void counter(Map<Character, Integer> map) {
        for (char countV : map.keySet()) {
            if (map.get(countV) == 1) {
                System.out.println("Первый неповторяющийся символ в слове: " + countV);
                break;
            }
        }
    }
}
