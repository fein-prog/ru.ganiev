package ru.ganiev.task29;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String, Person> map = createMap();
        System.out.println(map);
        removeTheDuplicates(map);
        System.out.println(map);
    }

    private static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;

    }

    private static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    private static void removeTheDuplicates(Map<String, Person> map) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (Collections.frequency(copy.values(), pair.getValue()) > 1) {
                removeItemFromMapByValue(map, pair.getValue());
                map.put(pair.getKey(), pair.getValue());
                }
        }
    }
}
