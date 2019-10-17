package ru.ganiev.task8;

import java.util.Date;

public class Converter {

    public static void main(String[] args) {
        Act act = new Act();
        act.setNumber(1);
        act.setData(new Date());
        act.setGoods(new char[] {'1', '3', '3'});
        Dogovor dogovor = convert(act);
        System.out.println(dogovor);

        act = new Act(1, new Date(), new char[]{'q', 'w', 'e'});
        System.out.println(convert(act));

    }

    static Dogovor convert(Act act) {
        return new Dogovor(act.getNumber(), act.getData(), act.getGoods());
    }



}