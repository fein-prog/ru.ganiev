package ru.ganiev.task8;

import java.util.Scanner;

public class AppCalculatorAndCounter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNumber = in.nextDouble();
        System.out.print("Введите второе число: ");
        double secondNumber = in.nextDouble();
        System.out.println();

        System.out.println("Класс Calculator");
        System.out.println("Операция вычитания из первого числа: " + Calculator.subtraction(firstNumber, secondNumber));
        System.out.println("Операция сложения: " + Calculator.summa(firstNumber, secondNumber));
        System.out.println("Операция умножения: " + Calculator.multiplication(firstNumber, secondNumber));
        System.out.println("Операция деления первого на второе: " + Calculator.dividing(firstNumber, secondNumber));
        System.out.println("Операция взятия процента от первого числа: " + Calculator.percent(firstNumber, secondNumber));
        System.out.println();

        Counter firstObj = new Counter ();
        Counter secondtObj = new Counter ();
        System.out.println("В классе Counter создано объектов: " + Counter.count);

    }
}
