package ru.Sobolev.lesson09.Task01;

public class Squirrel extends Animal implements Interfaces.Run {
    @Override
    void Name() {
        System.out.printf("Белка");
        System.out.printf(" он может:\n");
        run();
    }
}
