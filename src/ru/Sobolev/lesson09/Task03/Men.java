package ru.Sobolev.lesson09.Task03;

import java.util.StringJoiner;

abstract class Men implements InterfacesMen.Run, InterfacesMen.Swim {
    public static void main(String[] args) {
        StringJoiner string = new StringJoiner("");
        string.add("Взрослый человек может " + InterfacesMen.Swim.swim() + ", ");
        string.add(InterfacesMen.Run.runFast() + ", " + InterfacesMen.Run.runSlow());
        System.out.println(string.toString());
    }
}
