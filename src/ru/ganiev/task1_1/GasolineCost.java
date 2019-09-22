package ru.ganiev.task1_1;

import java.util.Scanner;

public class GasolineCost {

    public static void main (String[] args) {
        byte price = 43;
        float cost;
        Scanner in = new Scanner(System.in);
        System.out.print("Number of liters: ");
        float quantity = in.nextFloat();
        cost = price * quantity;

        System.out.printf("Gasoline cost: " + cost);
    }
}
