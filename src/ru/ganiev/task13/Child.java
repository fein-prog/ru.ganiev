package ru.ganiev.task13;

public class Child {
    public void eats (String s) {
        try {
            if ("морковь".equals(s)) {
                System.out.println("съел морковь за обе щеки");
            }
            if ("яблоко".equals(s)) {
                System.out.println("съел яблоко за обе щеки");
            }
            if ("каша".equals(s)){

            }
        } catch (Exception e) {
            System.out.println("невкусная еда");
        } finally {
            System.out.println("Cпасибо, мама");
        }

    }
}
