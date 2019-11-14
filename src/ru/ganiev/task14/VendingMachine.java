package ru.ganiev.task14;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class VendingMachine {
    private final static Logger logger = Logger.getLogger(VendingMachine.class.getName());
    public static void main(String[] args) throws Exception {
        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
        logger.info("начали работу программы");
        System.out.println("Внесите деньги -> выберите номер напитка и получите его -> заберите сдачу");
        System.out.println("Номера напитков и цена:");
        System.out.println("Напиток №" + Drinks.COCA_COLA.getNumber() + " " + Drinks.COCA_COLA.getTitle() + ": " + Drinks.COCA_COLA.getPrice() + "руб.");
        System.out.println("Напиток №" + Drinks.FANTA.getNumber() + " " + Drinks.FANTA.getTitle() + ": " + Drinks.FANTA.getPrice() + "руб.");
        System.out.println("Напиток №" + Drinks.SPRITE.getNumber() + " " + Drinks.SPRITE.getTitle() + ": " + Drinks.SPRITE.getPrice() + "руб.");

        int sum = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Внесите деньги и по завершении введите слово СУММА:");
            String money = in.nextLine();
            if (money.equals("СУММА")) {
                break;
            }
            sum += Integer.parseInt(money);
            if (sum == 0) {
                logger.warning("не хватает денег!");
                System.out.println("Вы не внесли деньги!");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер напитка:");
        int number = input.nextInt();
        if (number == Drinks.COCA_COLA.getNumber() && sum > Drinks.COCA_COLA.getPrice()) {
            System.out.println("Заберите напиток и сдачу: " + (sum - Drinks.COCA_COLA.getPrice()));}

        if (number == Drinks.FANTA.getNumber() && sum > Drinks.FANTA.getPrice()) {
            System.out.println("Заберите напиток и сдачу: " + (sum - Drinks.FANTA.getPrice()));}

        if (number == Drinks.SPRITE.getNumber() && sum > Drinks.SPRITE.getPrice()) {
                System.out.println("Заберите напиток и сдачу: " + (sum - Drinks.SPRITE.getPrice()));}
        }


    }
}



