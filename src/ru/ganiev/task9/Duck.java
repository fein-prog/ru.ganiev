package ru.ganiev.task9;

public class Duck extends Animal implements Run,Fly,Swim {

    String name;
    int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void fly() {
        System.out.println("Утка " + getName() + " летает");
    }

    @Override
    public void run() {
        System.out.println("Утка " + getName() + " бегает");
    }

    @Override
    public void swim() {
        System.out.println("Утка " + getName() + " плавает");
    }
}