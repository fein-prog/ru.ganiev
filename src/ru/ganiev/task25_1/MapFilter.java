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

        System.out.println(map);
        System.out.println("Словарь пустой? " + map.isEmpty());

        System.out.println("Нет одинаковых значений? " + isUnique(map));
    }

    private static boolean isUnique(Map<String, String> map) {
        for (String v : map.values()) {
            if (Collections.frequency(map.values(), v) > 1)
                return false;
            else
                return true;
        }
        return false;
    }
}
