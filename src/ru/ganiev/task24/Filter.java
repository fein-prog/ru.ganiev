package ru.ganiev.task24;


import java.util.HashSet;
import java.util.Iterator;
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

        removeEvenLength(strings) ;
        System.out.println(strings);
    }

    public static Set<String> removeEvenLength(Set<String> set){
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String s =  iterator.next();
            if (s.length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }

}
