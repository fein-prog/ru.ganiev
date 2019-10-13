package ru.ganiev.task8;

public class Converter {

    public static void main(String[] args) {

        Object obj1 = new Act();
        Act act = (Act) obj1;

        Object obj2 = new Dogovor();
        Dogovor dogovor = (Dogovor) obj2;
    }

    static void convert() {
        Converter convert = new Converter();
        //не доделано, не могу понять как сконвертировать поля

    }



}
