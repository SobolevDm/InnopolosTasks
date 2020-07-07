package ru.Sobolev.lesson09.Task03;

public class Baby extends Men {
    public static void main(String[] args) {
        System.out.printf("Ребенок может " + InterfacesMen.Run.runSlow() + " и " + InterfacesMen.Run.runFast());
    }
}
