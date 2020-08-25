package ru.Sobolev.old.lesson09.Task01;

public class Falcon extends Animal implements Interfaces.Fly, Interfaces.Run {
    @Override
    void Name() {
        System.out.printf("Сокол");
        System.out.printf(" он может:\n");
        fly();
        run();
    }
}
