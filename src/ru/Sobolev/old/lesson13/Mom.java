package ru.Sobolev.old.lesson13;

public class Mom {

    public static void main(String[] args) {
        Child baby = new Child();
        for (Food f : Food.values()) {
            try {
                baby.eat(f.valueOf(f.name()));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Спасибо Мама! Дай я тебя поцелую!");
            }
        }
    }
}
