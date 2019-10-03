package ru.ganiev.task6;

  public class Ceh {
    int revenue;
    int quantityOfDetails;
    int price;

     void setRevenue(int price, int quantityOfDetails) {
         this.quantityOfDetails = quantityOfDetails;
         this.price = price;
         revenue = price * quantityOfDetails;
     }

 }
