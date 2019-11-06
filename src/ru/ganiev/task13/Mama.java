package ru.ganiev.task13;

import java.util.Scanner;

public class Mama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите следующие продукты: морковь, яблоко, каша. Введите exit для выхода.");
        while (scanner.hasNext()) {
            String s = scanner.next();
            if ("exit".equals(s)) {
                break;
            }
            try {
                if ("морковь".equals(s)) {
                    System.out.println("съел морковь за обе щеки");
                }
                if ("яблоко".equals(s)) {
                    System.out.println("съел яблоко за обе щеки");
                }
                if ("каша".equals(s)){
                }
                else {
                    System.out.println("Введен неизвестный продукт");
                    break;
                }
            } catch (Exception e) {

            } finally {
                System.out.println("Cпасибо, мама");
            }
        }
    }
}