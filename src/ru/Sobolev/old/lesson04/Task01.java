package ru.Sobolev.old.lesson04;

import java.util.Scanner;

class Task01 {

    public static void main(String[] args) {

        double a, b;

        for (; ; ) {
            System.out.print("Введите первое число: ");
            Scanner numberA = new Scanner(System.in);
            if (numberA.hasNextDouble()) {
                a = numberA.nextDouble();
                break;
            } else {
                System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
            }
        }
        for (; ; ) {
            System.out.print("Введите второе число: ");
            Scanner numberB = new Scanner(System.in);
            if (numberB.hasNextDouble()) {
                b = numberB.nextDouble();
                break;
            } else {
                System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
            }
        }
        System.out.println("");
        System.out.println("a = " + a);
        System.out.println("b =" + b);
        if (a == b) {
            System.out.println("a равно b");
        } else {
            if (a < b) {
                System.out.println("a меньше b");
            } else {
                System.out.println("a больше b");
            }
        }
    }


}
