package ru.Sobolev.lesson27;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {

        int fib, fib1 = 0, fib2 = 1;
        int help = numberFib();
        System.out.println("Вывод ряда Фибоначи через интерацию:");
        System.out.printf("0, 1");
        for (int i = 1; i < help - 1; i++) {
            fib = fib1 + fib2;
            System.out.printf(", " + fib);
            fib1 = fib2;
            fib2 = fib;
        }

        System.out.printf("%nВывод ряда Фибоначи через рекурсию:%n");
        System.out.printf("0, 1");
        fibRecurs(help, 0, 1);


    }

    static int numberFib() {
        String errorUser = "Задан неверный параметр!";
        int newFib = 0, scan;
        boolean exitNumberFib = false;

        for (; ; ) {
            Scanner scanQuan = new Scanner(System.in);
            System.out.printf("Введите целое число для которого хотите вывести ряд Фибоначи от 2 до 30%n");
            if (scanQuan.hasNextInt()) {
                scan = scanQuan.nextInt();
                if (scan > 1 && scan < 31) {
                    newFib = scan;
                    exitNumberFib = true;
                } else {
                    System.out.println(errorUser);
                }
            } else {
                System.out.println(errorUser);
            }
            if (exitNumberFib == true) {
                break;
            }
        }
        return newFib;
    }

    static void fibRecurs(int help, int fib1, int fib2) {
        int fib;
        if (help - 2 > 0) {
            fib = fib1 + fib2;
            System.out.printf(", " + fib);
            fib1 = fib2;
            fib2 = fib;
            help--;
            fibRecurs(help, fib1, fib2);
        }
    }
}
