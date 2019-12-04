package ru.ganiev.task27;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        System.out.println("Введите номер числа Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(f(i) + ", ");
        }
    }

    private static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
