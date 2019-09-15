package ru.ganiev.task1_3;

import java.util.Scanner;

public class ConvertingOfSeconds {

    private byte d;

    public static void main(String[] args) {
        int d = 3600; //количество секунд в 1 часе/
        float e;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        float f = in.nextFloat(); //количество секунд/
        e = f / d; //Количество часов/

        System.out.printf("Number of hours in a second: " + e);
    }

}
