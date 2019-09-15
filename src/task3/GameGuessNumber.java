package task2;

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

            if (enteredNumber == 0) {
                break;
            }

            prevNumber = thisNumber;
            thisNumber = Math.abs(randomNumber - enteredNumber);

            if (prevNumber >= thisNumber) {
                System.out.println("Горячо");
            } else {
                System.out.println("Холодно");
            }

        } while (enteredNumber != 0);
    }
}