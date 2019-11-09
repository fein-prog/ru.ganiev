package ru.ganiev.task13;

import java.util.Scanner;

public class Mama {

    private static final String EXIT = "exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Child child = new Child();

        System.out.println("Введите следующие продукты: морковь, яблоко, каша. Введите exit для выхода.");
        while (scanner.hasNext()) {
            String food = scanner.next();
            if (EXIT.equals(food)) {
                break;
            }
            child.eats(food);
        }
    }
}