package ru.Sobolev.old.lesson09.Task01;

public interface Interfaces {
    public interface Fly {
        default void fly() {
            System.out.println(" летать ");
        }
    }

    public interface Run {
        default void run() {
            System.out.println(" бегать ");
        }
    }

    public interface Swim {
        default void swim() {
            System.out.println(" плавать ");
        }
    }
}
