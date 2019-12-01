package ru.ganiev.task31;

import java.util.Scanner;

public class Palindrome_1 {
    public static void main(String[] args) {
        System.out.println("Введите текст для проверки");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        palindrome(s);
    }

    public static Boolean palindrome(String s) {
        if (s.equals((new StringBuilder(s)).reverse().toString()))
            System.out.println("Это палиндром");
        else
            System.out.println("Это не палиндром");
        return null;
    }
}


