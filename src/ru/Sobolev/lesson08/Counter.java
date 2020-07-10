package ru.Sobolev.lesson08;

public class Counter {
    static int count;

    public static void invokeCounter() {
        count++;
        System.out.println("Текущее значение счётчика - " + count);
    }
}
