package ru.Sobolev.lesson08.Task1;

import ru.Sobolev.old.lesson08.Task1.Actions;

import java.util.Scanner;

public class Calculator {

    static int action; //Переменная арифметического действия
    static boolean exitMain = false; //Переменная для завершения ПО
    private static double numberOne, numberTwo;// Переменные двух введенных чисел для дальнейшего вычисления

    public static double getNumberOne() {
        return numberOne;
    }

    public static double getNumberTwo() {
        return numberTwo;
    }

    public static void main(String[] args) {

        for (; ; ) {

            //выбор действий (сложение, вычетание ит.д.)
            // Как данный выбор перенести в отдельный класс?
            for (; ; ) {
                System.out.println("Выберите пункт меню из диапазона от 0 до 5");
                System.out.println("1. Сложение");
                System.out.println("2. Вычитание");
                System.out.println("3. Умножение");
                System.out.println("4. Деление");
                System.out.println("5. Процент от числа");
                System.out.println("0. Выход из программы");

                Scanner numberAction = new Scanner(System.in);
                if (numberAction.hasNextInt()) {
                    action = numberAction.nextInt();
                    if (action < 0 || action > 5) {
                        System.out.println("Нужно выбрать пункт из имеющегося списка.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
                }
            }
            //Считываем два числа
            if (action == 0) {
                break;
            }
            for (; ; ) {
                System.out.print("Введите первое число: ");
                Scanner numberA = new Scanner(System.in);
                if (numberA.hasNextDouble()) {
                    numberOne = numberA.nextDouble();
                    break;
                } else {
                    System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
                }
            }
            for (; ; ) {
                System.out.print("Введите второе число: ");
                Scanner numberB = new Scanner(System.in);
                if (numberB.hasNextDouble()) {
                    numberTwo = numberB.nextDouble();
                    break;
                } else {
                    System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
                }
            }
            //Если введенные значения два числа, то идет вычисление
            synchronized (Actions.class) {
                Actions.firstNumber = numberOne;
                Actions.secondNumber = numberTwo;
            }
            switch (action) {
                case (1):
                    //Сложение
                    Actions.Addition();
                    System.out.printf("Сложение %f и %f = %f. \n", numberOne, numberTwo, Actions.getAnswer());
                    break;
                case (2):
                    // Вычитание
                    Actions.Subtraction();
                    System.out.printf("Вычитание %f из %f = %f. \n", numberTwo, numberOne, Actions.getAnswer());
                    break;
                case (3):
                    //Умножение
                    Actions.Multiplication();
                    System.out.printf("Умножение %f и %f = %f. \n", numberOne, numberTwo, Actions.getAnswer());
                    break;
                case (4):
                    //Деление
                    Actions.Division();
                    System.out.printf("Деление %f на %f = %f. \n", numberOne, numberTwo, Actions.getAnswer());
                    break;
                case (5):
                    //Процент числа
                    Actions.Percent();
                    System.out.printf("%f составляет %f%% от %f. \n", numberTwo, Actions.getAnswer(), numberOne);
                    break;
            }
        }
    }
}