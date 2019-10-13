package ru.ganiev.task8;

class Calculator{

    static double subtraction ( double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    static double summa (double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    static double multiplication (double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    static double dividing (double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    static double percent (double firstNumber, double secondNumber) {
        return (secondNumber / firstNumber) * 100;
    }
}
