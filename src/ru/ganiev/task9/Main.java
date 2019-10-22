package ru.ganiev.task9;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Пушистик", 2) {
            @Override
            public void getName(String name, int age) {
            }
        };
        String catName = cat.getName();
        int catAge = cat.getAge();

        System.out.println("Кот: " + catName + " " + catAge + "года");

        Dogs dog = new Dogs("Шарик", 4) {
            @Override
            public void getName(String name, int age) {
            }
        };
        String dogName = dog.getName();
        int dogAge = dog.getAge();

        System.out.println("Пес: " + dogName + " " + dogAge + "года");

        Duck duck = new Duck("Мустанг", 3) {
            @Override
            public void getName(String name, int age) {
            }
        };
        String duckName = duck.getName();
        int duckAge = duck.getAge();

        System.out.println("Утка: " + duckName + " " + duckAge + "года");



    }
}
