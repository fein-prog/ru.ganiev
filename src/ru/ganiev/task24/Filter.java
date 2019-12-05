package ru.ganiev.task24;


import java.util.HashSet;
import java.util.Set;

public class Filter {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("foo");
        strings.add("buzz");
        strings.add("bar");
        strings.add("fork");
        strings.add("bort");
        strings.add("spoon");
        strings.add("!");
        strings.add("dude");

        System.out.println(strings);

        Set<String> filtered = removeEvenLength(strings);
        System.out.println(filtered);
    }

    private static Set<String> removeEvenLength(Set<String> set) {
        Set<String> strings = new HashSet<>();
        for (String s : set) {
            if (s.length() % 2 == 1) {
                strings.add(s);
            }
        }
        return strings;
    }

}
