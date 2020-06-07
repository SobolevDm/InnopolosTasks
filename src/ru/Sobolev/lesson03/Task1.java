package ru.Sobolev.lesson03;

import java.util.Scanner;

public class Task1 {
    // Программы из домашнего задания 2 с возможностью воода
    // Первая программа по рассчету стоимости бензина
    public static void main(String[] args) {
        double price = 43.21;
        int b, chek;
        System.out.println("Запущена первая программа по рссчету стоимости бензина.");
        System.out.print("Введите целое число литров, которое хотите заправить: ");

        for (chek = 1; chek < 10; chek++) { // Проверка на целое число
            Scanner galon = new Scanner(System.in);
            if (galon.hasNextInt()) {
                b = galon.nextInt();
                System.out.println("За " + b + " литров бензина Вы заплатите " + price * b + " ₽.");
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
                System.out.println("При зарплате " + salary + " ₽ на руки Вы получите " + hands + " ₽.");
                chek = 10;
            } else {
                System.out.println("Необходимо ввести число!");
                System.out.print("Пожалуйста попробуйте еще раз: ");
                chek--;
            }
        }
        // Третья программа из второго задания
        // Переводим секунды в часы
        double a; // Секунды
        double h; // Часы

        System.out.println();
        System.out.println("Запущена третья программа по переводу секунд в часы.");
        System.out.print("Введите число секунд, которое требуется перевести: ");

        for (chek = 1; chek < 10; chek++) { // Проверка на число
            Scanner sec = new Scanner(System.in);
            if (sec.hasNextDouble()) {
                a = sec.nextDouble();
                h = a / 3600;
                System.out.println(a + " секунд составят " + h + " часов.");
                chek = 10;
            } else {
                System.out.println("Необходимо ввести число!");
                System.out.print("Пожалуйста попробуйте еще раз: ");
                chek--;
            }
        }

//        b = a / 3600;
//        System.out.print(a + " секунд составят " + b + " часов.");


    }
}
