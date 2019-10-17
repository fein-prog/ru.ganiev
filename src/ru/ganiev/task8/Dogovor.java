package ru.ganiev.task8;

import java.util.Arrays;
import java.util.Date;

public class Dogovor {
    private int number;
    private Date data;
    private char[] goods;

    public Dogovor(int number, Date data, char[] goods) {
        this.number = number;
        this.data = data;
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Dogovor{" +
                "number=" + number +
                ", data=" + data +
                ", goods=" + Arrays.toString(goods) +
                '}';
    }
}