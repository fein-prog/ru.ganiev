package ru.ganiev.task6;

class Ceh {
    private int quantityOfDetails;
    private int price;

    Ceh(int price, int quantityOfDetails) {
        this.price = price;
        this.quantityOfDetails = quantityOfDetails;
    }

    int getQuantityOfDetails() {
        return quantityOfDetails;
    }

    int getPrice() {
        return price;
    }
}