package ru.Sobolev.lesson13;

import java.util.Scanner;

public class InputMain {

    public static void main() {
        for (; ; ) {
            System.out.println("Выберите чем хотите покормить ребенка:");
            for (Food f : Food.values()) {
                System.out.printf("%d %s%n", f.ordinal() + 1, f.name());
            }
            System.out.println("0 Выход");
            int action;
            Scanner numberAction = new Scanner(System.in);
            if (numberAction.hasNextInt()) {
                action = numberAction.nextInt();
                if (action < 0 || action > Food.values().length) {
                    System.out.println("Нужно выбрать пункт из имеющегося списка.");
                } else {
                    Mom.action = action;
                    break;
                }
            } else {
                System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
            }
        }
    }
}
