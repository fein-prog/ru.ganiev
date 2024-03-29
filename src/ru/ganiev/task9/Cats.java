package ru.ganiev.task9;

public class Cats extends Animal implements Run {

    String name;
    int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String model) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("Кошка по имени " +  getName() + " быстро бегает");
    }
}