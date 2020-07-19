package ru.Sobolev.lesson13;

public enum Food {
    APPLE("да"),     // яблоко
    CANDY("да"),     // конфета
    CARROT("нет"),   // морковь
    PORRIDGE("нет"); //каша

    String foodBaby;

    Food(String foodBaby) {
        this.foodBaby = foodBaby;
    }
}
