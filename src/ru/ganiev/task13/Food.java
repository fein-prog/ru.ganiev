package ru.ganiev.task13;

public enum Food {
    CARROT("морковь"),
    APPLE("яблоко"),
    PORRIDGE("каша");

    private String name;

    Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
