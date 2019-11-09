package ru.ganiev.task13;

import ru.ganiev.task13.Food;

public class Child {

    private static final Food[] favoriteFoods = new Food[]{Food.CARROT, Food.APPLE};

    public void eats (String food) {
        try {
            for(Food favoriteFood : favoriteFoods) {
                if (favoriteFood.getName().equals(food)) {
                    System.out.printf("съел %s за обе щеки\n", food);
                }
            }
            if (Food.PORRIDGE.getName().equals(food)) {
                throw new Exception("невкусная еда");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cпасибо, мама");
        }

    }
}