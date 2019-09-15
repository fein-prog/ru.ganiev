package ru.ganiev.task1_1;

import java.util.Scanner;

public class GasolineCost {

    public static void main (String[] args) {
        byte a = 43; //цена/
        float c;
        Scanner in = new Scanner(System.in);
        System.out.print("Number of liters: ");
        float b = in.nextFloat(); //количество литров/
        c = a*b; //стоимость/

        System.out.printf("Gasoline cost: " + c);
    }
}
