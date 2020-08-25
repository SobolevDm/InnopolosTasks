package ru.Sobolev.old.lesson09.Task01;

public class Hare extends Animal implements Interfaces.Run {
    @Override
    void Name() {
        System.out.printf("Заяц");
        System.out.printf(" он может:\n");
        run();
    }
}
