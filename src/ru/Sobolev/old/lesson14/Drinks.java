package ru.Sobolev.old.lesson14;

public enum Drinks {

    //Класс напитков
    CHERN("Черный кофе", 50),
    KAPUCH("Капучино", 70),
    CHAY("Чай", 40),
    SHOK("Горячий шоколад", 60);

    String nameDrink;
    int priceDrink;

    Drinks(String nameDrink, int priceDrink) {
        this.nameDrink = nameDrink;
        this.priceDrink = priceDrink;
    }


}
