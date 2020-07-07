package ru.Sobolev.lesson09.Task01;

public class Interfaces {
    //Интерфейсы
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
