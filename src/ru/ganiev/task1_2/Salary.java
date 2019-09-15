package ru.ganiev.task1_2;

import java.util.Scanner;

public class Salary {
    private byte d;

    public static void main (String[] args) {
        byte d = 13; //налог 13%/
        float e;
        Scanner in = new Scanner(System.in);
        System.out.print("Dirty salary: ");
        float f = in.nextFloat(); //Зарплата без вычета налога/
        e = f*(100-13)/100; //Зарплата полученная на руки/

        System.out.printf("To payment: " + e);
    }
}
