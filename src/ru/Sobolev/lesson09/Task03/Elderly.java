package ru.Sobolev.lesson09.Task03;

import java.util.StringJoiner;

public class Elderly extends Men {
    //public class Elderly{
    // Если не делать наследование от Men, то всё равно работает
    // полагаю это из-за интерфейсов, которые можем использовать по всему ПО, верно?
    public static void main(String[] args) {
        StringJoiner string = new StringJoiner("");
        string.add("Пожилой человек может " + InterfacesMen.Swim.swim() + ", ");
        string.add(InterfacesMen.Run.runSlow());
        System.out.println(string.toString());
    }
}
