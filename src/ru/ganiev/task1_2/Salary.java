package ru.ganiev.task1_2;

import java.util.Scanner;

public class Salary {

    public static void main (String[] args) {
        byte ndfl = 13;
        float totalSalary;
        Scanner in = new Scanner(System.in);
        System.out.print("Dirty salary: ");
        float dirtySalary = in.nextFloat();
        totalSalary = dirtySalary * (100 - ndfl) / 100;

        System.out.printf("To payment: " + totalSalary);
    }
}
