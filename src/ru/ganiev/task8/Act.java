package ru.ganiev.task8;

import java.util.Date;

public class Act {
    private int number;
    private Date data;
    private char[] goods;

    public Act() {
    }

    public Act(int number, Date data, char[] goods) {
        this.number = number;
        this.data = data;
        this.goods = goods;
    }

    public int getNumber() {
        return number;
    }

    public Date getData() {
        return data;
    }

    public char[] getGoods() {
        return goods;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setGoods(char[] goods) {
        this.goods = goods;
    }
}