package ru.ganiev.task9;

public class Diver extends Person{

    String name;
    int age;

    public Diver(String name, int age) {
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
    public void swim() {
        System.out.println("Дайвер по имени " +  getName() + " плавает очень быстро");
    }

    @Override
    public void run() {

    }
}