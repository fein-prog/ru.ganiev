package ru.ganiev.task9;

public class Athlete extends Person {
    String name;
    int age;

    public Athlete(String name, int age) {
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
        System.out.println("Спортсмен по имени " +  getName() + " быстро бегает");
    }

    @Override
    public void swim() {
        System.out.println("Спортсмен по имени " +  getName() + " ловко плавает");
    }

}