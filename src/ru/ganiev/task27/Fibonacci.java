package ru.ganiev.task27;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {

        System.out.println("Введите номер числа Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; ++i) {
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Число Фибоначчи: " + b);
    }
}
