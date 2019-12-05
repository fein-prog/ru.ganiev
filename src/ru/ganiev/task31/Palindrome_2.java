package ru.ganiev.task31;

import java.util.Scanner;

public class Palindrome_2 {
    public static void main(String[] args) {
        System.out.println("Введите текст для проверки");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        if (palindrome(s))
                System.out.println("Это палиндром");
        else
                System.out.println("Это не палиндром");

    }

    private static boolean palindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1))
                return false;
        }
        return true;
    }
}
