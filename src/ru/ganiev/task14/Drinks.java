package ru.ganiev.task14;

public enum Drinks { COCA_COLA (1,"КОКА-КОЛА", 50), FANTA (2,"ФАНТА", 60), SPRITE (3,"СПРАЙТ", 55);
    private int number;
    private String title;
    private int price;

    Drinks (int number, String title, int price) {
        this.number = number;
        this.title = title;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

}
