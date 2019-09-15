package ru.ganiev.task4_1;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число №1:");
        int enteredNumber1 = scanner.nextInt();
        System.out.println("Введите число №2:");
        int enteredNumber2 = scanner.nextInt();

        if (enteredNumber1 < enteredNumber2 && enteredNumber1 != enteredNumber2) {
            System.out.println("Число №1 мельне числа №2");
        }

        if (enteredNumber1 > enteredNumber2 && enteredNumber1 != enteredNumber2) {
            System.out.println("Число №2 мельне числа №1");
        }

        if (enteredNumber1 == enteredNumber2) {
            System.out.println("Число №1 равно числу №2");
        }
    }
}
