package ru.ganiev.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 20));
        people.add(new Person("Nick", 24));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bill", 35));

        iterate(people);

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        System.out.println();
        System.out.println("People list");
        System.out.println();

        Collections.sort(people, new PersonSuperComparator());

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        System.out.println();
        System.out.println("Sorted people list");
        System.out.println();

    }

    private static void iterate(List<Person> people) {
        Iterator i = people.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.print(" : ");
        }
        System.out.println();
    }
}
