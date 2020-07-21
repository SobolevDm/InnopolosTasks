package ru.Sobolev.lesson13;

public class Child {
    // метод кушать
    public void eat(Food food) throws Exception {
        if (food.foodBaby == "нет") {
            throw new Exception("Выплюнул еду...");
        } else {
            System.out.printf("Съел за обе щёки! ");
        }
    }
}
