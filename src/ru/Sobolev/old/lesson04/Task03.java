package ru.Sobolev.old.lesson04;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        int numberInt;

        for (; ; ) {
            System.out.println("Для вывода таблицы умножения введите число от 1 до 9");
            Scanner word = new Scanner(System.in);
            if (word.hasNextInt()) {
                numberInt = word.nextInt();
                if ((numberInt >= 1) | (numberInt <= 9)) {
                    for (int count = 1; count < 10; count++) {
                        System.out.printf("%d * %d = %d \n", numberInt, count, count * numberInt);
                    }
                    break;
                } else {
                    System.out.println("Необходимо вводить только цифры от 1 до 9! Пожалуйста попробуйте еще раз.");
                }
            } else {
                System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
            }
        }
    }

}
