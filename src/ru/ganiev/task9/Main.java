package ru.ganiev.task9;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Пушистик", 2);
        String catName = cat.getName();
        int catAge = ((Cats)cat).getAge();
        System.out.println("Кот: " + catName + " " + catAge + " года");
        cat.run();

        Dogs dog = new Dogs("Шарик", 4);
        String dogName = dog.getName();
        int dogAge = dog.getAge();
        System.out.println("Пес: " + dogName + " " + dogAge + " года");
        dog.run();

        Duck duck = new Duck("Кряква", 3);
        String duckName = duck.getName();
        int duckAge = duck.getAge();
        System.out.println("Утка: " + duckName + " " + duckAge + " года");
        duck.fly();
        duck.run();
        duck.swim();

        Athlete athlete = new Athlete("Рифат", 25);
        String athletName = athlete.getName();
        int athletekAge = athlete.getAge();
        athlete.run();
        athlete.swim();

        Diver diver = new Diver("Зульфат", 30);
        String divertName = diver.getName();
        int diverkAge = diver.getAge();
        diver.swim();

    }
}
