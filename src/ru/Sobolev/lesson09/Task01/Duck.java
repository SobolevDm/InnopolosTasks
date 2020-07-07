package ru.Sobolev.lesson09.Task01;

public class Duck extends Animal implements Interfaces.Fly, Interfaces.Swim, Interfaces.Run {
    @Override
    void Name() {
        System.out.printf("Утка");
        //Данная конструкция не идет из-за того что вызываю интерфейсы и их нельзя определить как строку?
//        System.out.printf("Она может: %s $s $s", fly(), run(), swim()); //сделать возврат переменной
        System.out.printf(" она может:\n");
        fly();
        run();
        swim();
    }
}
