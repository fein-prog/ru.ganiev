package ru.ganiev.task22;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int compareTo(Person p) {

        int result = this.name.compareTo(p.name);
        if (result == 0) {
            result = this.age.compareTo(p.age);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                '}';
    }

}