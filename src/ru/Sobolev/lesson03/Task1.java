package ru.Sobolev.lesson03;

import java.util.Scanner;
public class Task1 {
    // Программы из домашнего задания 2 с возможностью воода
    // Первая программа по рассчету стоимости бензина
    public static void main(String[] args) {
        double price = 43.21;
        int amount, chek;


        System.out.println("Запущена первая программа по рссчету стоимости бензина.");
        System.out.print("Введите целое число литров, которое хотите заправить: ");

        for (chek = 1; chek < 10; chek++) { // Проверка на целое число
            Scanner galon = new Scanner(System.in);
            if (galon.hasNextInt()) {
                amount = galon.nextInt();
                System.out.printf("За %d литров бензина Вы заплатите %f ₽.", amount, price * amount);
                chek = 10;
            } else {
                System.out.println("Необходимо ввести целое число!");
                System.out.print("Пожалуйста попробуйте еще раз: ");
                chek--;
            }
        }
        // Вторая программа из второго задания
        // Рассчет зарплаты на руки
        System.out.println();
        System.out.println("Запущена вторая программа из второго задания.");
        System.out.print("Введите зарплату по окладу:");

        double salary, nalog = 13, hands;
        chek = 1;
        for (chek = 1; chek < 10; chek++) { //Проверка на число
            Scanner oklad = new Scanner(System.in);
            if (oklad.hasNextInt()) {
                salary = oklad.nextDouble();


                nalog = salary / 100 * nalog;
                hands = salary - nalog;
                System.out.printf("При зарплате %f ₽ на руки Вы получите %f ₽.", salary, hands);
                chek = 10;
            } else {
                System.out.println("Необходимо ввести число!");
                System.out.print("Пожалуйста попробуйте еще раз: ");
                chek--;
            }
        }
        // Третья программа из второго задания
        // Переводим секунды в часы
        double second; // Секунды
        double hour; // Часы

        System.out.println();
        System.out.println("Запущена третья программа по переводу секунд в часы.");
        System.out.print("Введите число секунд, которое требуется перевести: ");

        for (chek = 1; chek < 10; chek++) { // Проверка на число
            Scanner sec = new Scanner(System.in);
            if (sec.hasNextDouble()) {
                second = sec.nextDouble();
                hour = second / 3600;
                System.out.printf("%f секунд составят %f часов.", second, hour);
                chek = 10;
            } else {
                System.out.println("Необходимо ввести число!");
                System.out.print("Пожалуйста попробуйте еще раз: ");
                chek--;
            }
        }


    }
}
