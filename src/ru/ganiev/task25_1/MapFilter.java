package ru.ganiev.task25_1;

import java.util.*;

public class MapFilter {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");

//        map.put("Вася", "Иванов");
//        map.put("Петр", "Петров");
//        map.put("Виктор", "Иванов");
//        map.put("Сергей", "Савельев");
//        map.put("Вадим", "Петров");

        System.out.println(map);
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        System.out.println("Словарь пустой? " + map.isEmpty());

    }
    public boolean isUnique(Map<String, String> map) {
        for (String v : map.values()) {
            if (Collections.frequency(map.values(), v) > 1)
                return false;
            else
                return true;
        }
        return false;
    }
}
