package ru.Sobolev.old.lesson13;
//оставить

public enum Food {
    APPLE("да"),     // яблоко
    CANDY("да"),     // конфета
    CARROT("нет"),   // морковь
    PORRIDGE("нет"); //каша

    String foodBaby;

    private Food(String foodBaby) {
        this.foodBaby = foodBaby;
    }
}
