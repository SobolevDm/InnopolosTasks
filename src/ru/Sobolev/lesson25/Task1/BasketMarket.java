package ru.Sobolev.lesson25.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketMarket {

    private static Map<String, Double> basket = new HashMap();

    public static void main(String[] args) {
        boolean exitPo = false;
        System.out.println("Ваша корзина была пуста, мы её заполнили по умолчанию.");
        for (; ; ) {
            menuAction();
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int helpNum = scan.nextInt();
                if (helpNum >= 1 && helpNum <= 5) {
                    switch (helpNum) {
                        case 1: { // добавить товар
                            System.out.println("Товар добавлен");
                            addBasket();
                            //вывод корзины
                            break;
                        }
                        case 2: { // удалить товар
                            System.out.println("Товар удален");
                            // удаляем 1-ю позицию из корзины
                            //вывод содержимого корзины
                            break;
                        }
                        case 3: { // изменить кол-во
                            System.out.println("Изменено кол-во");
                            // изменяет на 1 первую позицию в корзине, если значение кол-ва < 0 тогда удаляет позицию
//                вывод содеоржимого корзины
                            break;
                        }
                        case 4: { // очистить корзину
                            basket.clear();
                            System.out.println("Ваша корзина пуста!");
                            break;
                        }
                        case 5: { // очистить корзину
                            System.out.println("Выход из ПО");
                            exitPo = true;
                            break;
                        }
                    }//switch
                    if (exitPo == true) {
                        break;
                    }
                } else {
                    System.out.println("Выберите пункт меню!");
                }
            } else {
                System.out.println("Нужно выбрать пункт меню - введите цыфру от 1 до 5.");
            }
        }//for (;;)
    }//psvm

    public static void addBasket() {
        //Считаем что при заполнении корзины пользователь пополняет её определенными товарами на пределенное кол-во
        basket.clear();
        basket.put("Морквь", 3.450);
        basket.put("Молоко", (double) 5);
        basket.put("Сахар", (double) 2);
        basket.put("Картошка", 5.120);
        basket.put("Корм для кошек Wiskas", (double) 4);
        basket.put("Шампиньоны", 1.150);
        basket.put("Перец", 0.270);
        basket.put("Чеснок", 0.210);
        basket.put("Хлеб чёрный", (double) 1);
        basket.put("Курица", 1.320);
    }

    public static void menuAction() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить продукты в корзину");
        System.out.println("2. Удалить выбранный продукт из корзины");
        System.out.println("3. Изменить кол-во продуктов в корзине");
        System.out.println("4. Очистить корзину");
        System.out.println("5. Выход из программы");
    }

}
