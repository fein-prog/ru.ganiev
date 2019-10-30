package ru.ganiev.task11;

import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = sc.nextLine();
        String print = text.replaceAll("(?iu)бяка", "вырезано цензурой");
        System.out.println(print);
    }
}
