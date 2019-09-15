package ru.ganiev.task4_2;

import java.util.Scanner;

public class DescriptionOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int enteredNumber = scanner.nextInt();

        if (enteredNumber < 0 && (enteredNumber % 2 == 0)) {
            System.out.println("Введенное число отрицательное и четное");
        }

        if (enteredNumber > 0 && (enteredNumber % 2 == 0)) {
            System.out.println("Введенное число положительное и четное");
        }

        if (enteredNumber < 0 && (enteredNumber % 2 != 0)) {
            System.out.println("Введенное число отрицательное и нечетное");
        }

        if (enteredNumber > 0 && (enteredNumber % 2 != 0)) {
            System.out.println("Введенное число положительное и нечетное");
        }

        if (enteredNumber == 0 ) {
            System.out.println("Введенное число нулевое");
        }
    }
}
