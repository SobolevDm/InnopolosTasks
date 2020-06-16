package ru.Sobolev.lesson03;

import java.util.Scanner;

class MyColor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
}

public class Task2 {

    public static void main(String[] args) {

        //Задаем случайное число
        double rnd = Math.random();
        rnd = rnd * 100;
        int random = (int) rnd;
        System.out.println("Случайное число =" + random); // для проверки работы! позже сделать строку коментом

        //Задаем "Нулевой" ответ пользователя
        int number = 0; // Переменная для отслеживания ответа пользователя
        int chekNumber; //Переменная отслеживающая кол-во ответов пользователя
        for (chekNumber = -10; chekNumber <= 0; chekNumber++) {
            System.out.printf("У Вас осталось попыток %d шт.", chekNumber);
            System.out.print("Введите целое число от 0 до 100: ");
            Scanner word = new Scanner(System.in);
            // Проверка введенного числа
            int num = 0;
            if (word.hasNextInt()) {
                num = word.nextInt();
                if (num < 0 | num > 100) {
                    System.out.println("Введенное значение не удовлетворяет заданным условиям!");
                    System.out.print("Пожалуйста попробуйте еще раз. ");
                    chekNumber--;
                } else {
                    // тут играем
                    if (random == num) {
                        System.out.println(MyColor.ANSI_RED + "ВЫ ВЫИГРАЛИ ИГРУ! ПОЗДРАВЛЯЕМ!" + MyColor.ANSI_RESET);
                        break;
                    } else {
                        if (Math.abs(random - number) >= Math.abs(random - num)) {
                            System.out.println(MyColor.ANSI_RED + " Горячо." + MyColor.ANSI_RESET);
                            number = num;
                        } else {
                            System.out.println(MyColor.ANSI_BLUE + "Холодно." + MyColor.ANSI_RESET);
                            number = num;
                        }
                    }
                }
            } else {
                System.out.println("Введенное значение не удовлетворяет заданным условиям!");
                System.out.print("Пожалуйста попробуйте еще раз. ");
                chekNumber--;
            }
        }
        if (chekNumber == 0 & random != number) {
            System.out.println(MyColor.ANSI_RED + "ВЫ ПРОИГРАЛИ!" + MyColor.ANSI_RESET);
        }
    }
}
