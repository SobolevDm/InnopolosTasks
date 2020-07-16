package ru.Sobolev.lesson09.Task01;

public class Duck extends Animal implements Interfaces.Fly, Interfaces.Swim, Interfaces.Run {
    @Override
    void Name() {
        System.out.printf("Утка");
        System.out.printf(" она может:\n");
        fly();
        run();
        swim();
    }
}
