package ru.ganiev.task3;

import java.util.Scanner;

public class GameGuessNumber {

    public static void main(String[] args) {

        int initValue  = 1;
        int endValue = 100;
        int enteredNumber = 0;
        int randomNumber = initValue + (int) (Math.random() * endValue);
        System.out.println(randomNumber);
        int prevNumber = 0;
        int thisNumber = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 100 или 0 для выхода");
            enteredNumber = scanner.nextInt();

            if (enteredNumber == randomNumber) {
                System.out.println("Вы угадали");
                break;
            }

            if ((enteredNumber < 1 || enteredNumber > 100) && enteredNumber !=0) {
                System.out.println("Вы ввели неверное значение!");
            }

            prevNumber = thisNumber;
            thisNumber = Math.abs(randomNumber - enteredNumber);

            if (prevNumber >= thisNumber && enteredNumber >= 1 && enteredNumber <= 100) {
                System.out.println("Горячо");
            } else { if (enteredNumber >= 1 && enteredNumber <= 100)
                System.out.println("Холодно");
            }

        } while (enteredNumber != 0 );

    }
}