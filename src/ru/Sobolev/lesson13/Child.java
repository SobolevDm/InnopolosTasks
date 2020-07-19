package ru.Sobolev.lesson13;

public class Child {

    public static void main(int answerChild) {
        for (Food f : Food.values()) {
            if (f.ordinal() == Mom.getAction()) {
                try {
                    if (f.foodBaby == "да") {
                        System.out.println("Съел за обе щёки!");
                    } else {
                        throw new NullPointerException("Выплюнул еду...");
                    }
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Спасибо Мама! Давай я тебя поцелую!\n");
                }
            }
        }
    }
}
