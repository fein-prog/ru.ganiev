package ru.ganiev.task9;

public class Dogs extends Animal implements Run {

    String name;
    int age;

    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
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
        System.out.println("Собака по имени " + getName() + " бегает");
    }
}