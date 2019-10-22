package ru.ganiev.task9;

public abstract class Animal {
    String name;
    int age;


    public abstract void getName(String name, int age);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

}