package ru.ganiev.task27;

import java.util.Scanner;

public class Recursion {
    public static void main (String[] args) {

        System.out.println("Введите номер числа Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

    System.out.println("Число Фибоначчи: " + GetNFibonacci(n));

    }

    private static int GetNFibonacci(int n) {
        if (n>1)
            return GetNFibonacci(n-2) + GetNFibonacci(n-1); // формула Фибоначчи
        else
        if (n==1)
            return 1;
        else
            return 0; // если n==0
    }
}
