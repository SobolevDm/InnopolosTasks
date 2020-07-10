package ru.Sobolev.lesson08.Task2;

import java.util.Scanner;

public class Counter {

    static int answer;

    public static void main(String[] args) {

        int answer = 0;
        boolean exit = false;

        for (; ; ) {
            System.out.printf("Хотите создать Объект?\n1. Да\n2. Нет");

            Scanner numberAction = new Scanner(System.in);
            if (numberAction.hasNextInt()) {
                answer = numberAction.nextInt();
            } else {
                System.out.println("Нужно ввести целое число!");
            }

            switch (answer) {
                case (1):
                    Obj.Object();
                    System.out.println("Созданных объектов: " + Obj.getCount());
                    break;
                case (2):
                    exit = true;
                default:
                    System.out.println("Нужно ввести 1 или 2");
                    break;
            }

            if (exit == true) {
                System.out.println("Общее количество созданных объектов: " + Obj.getCount());
                break;
            }
        }
    }
}
