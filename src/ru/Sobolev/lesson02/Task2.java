package ru.Sobolev.lesson02;

public class Task2 {
    // Программа по рассчету заработаной платы на руки
    public static void main(String[] args) {
        double salary = 120000, nalog = 13, hands;
        nalog = salary / 100 * nalog;
        hands = salary - nalog;

        System.out.println("При зарплате " + salary + " ₽ на руки Вы получите " + hands + " ₽.");
    }
}
