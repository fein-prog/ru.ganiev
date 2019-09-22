package ru.ganiev.task1_3;

import java.util.Scanner;

public class ConvertingOfSeconds {

    public static void main(String[] args) {
        int numberOfSeconds = 3600;
        float numberOfHours;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        float enterSeconds = in.nextFloat();
        numberOfHours = enterSeconds / numberOfSeconds;

        System.out.printf("Number of hours in a second: " + numberOfHours);
    }

}
