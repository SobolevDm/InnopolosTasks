package ru.Sobolev.lesson02;

public class Task3 {
    // Программа по переводу секунд в часы
    public static void main(String[] args) {
        double second; // Секунды
        double hour; // Часы
        second = 108000;
        hour = second / 3600;
        System.out.print(second + " секунд составят " + hour + " часов.");
    }
}
