package ru.Sobolev.lesson25.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static ru.Sobolev.lesson25.textColor.*;

public class BasketMarket {

    private static Map<String, Double> basket = new HashMap();

    public static void main(String[] args) {
        boolean exitPo = false;
        System.out.println(tc_RED + "Ваша корзина была пуста, мы её заполнили по умолчанию." + tc_RESET);
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
                            getProducts();
                            break;
                        }
                        case 2: { // удалить товар
                            //поскольку по умолчанию удаляем первую позицию делаем цикл и после удаления выходим из него
                            //при полной реализации передавали бы String (ключ конкретного товара) для удаления
                            for (String i : basket.keySet()) {
                                basket.remove(i);
                                break;
                            }
                            System.out.println("Товар удален");
                            getProducts();
                            break;
                        }
                        case 3: { // изменить кол-во
                            System.out.println("Изменено кол-во");
                            // изменяет на 1 первую позицию в корзине, если значение кол-ва <= 0 тогда удаляет позицию
                            // по умолчанию считаем что изменяем кол-во на 1 первого товара в корзине
                            for (Map.Entry<String, Double> i : basket.entrySet()) {
                                updateProductQuantity(i.getKey(), -1);
                                break;
                            }
                            getProducts();
                            break;
                        }
                        case 4: { // очистить корзину
                            basket.clear();
                            System.out.println(tc_RED + "Ваша корзина пуста!" + tc_RESET);
                            break;
                        }
                        case 5: { // выход из ПО
                            System.out.println(tc_RED + "Выход из ПО" + tc_RESET);
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
                System.out.println(tc_RED + "Нужно выбрать пункт меню - введите цыфру от 1 до 5." + tc_RESET);
            }
        }//for (;;)
    }//psvm

    static void addBasket() {
        //Считаем что при заполнении корзины пользователь пополняет её определенными товарами на пределенное кол-во
        basket.clear();
        basket.put("Морквь\t\t", 3.450);
        basket.put("Молоко\t\t", (double) 5);
        basket.put("Сахар\t\t", (double) 2);
        basket.put("Картошка\t", 5.120);
        basket.put("Корм д.к. Wiskas", (double) 4);
        basket.put("Шампиньоны\t", 1.150);
        basket.put("Перец\t\t", 0.270);
        basket.put("Чеснок\t\t", 0.210);
        basket.put("Хлеб чёрный\t", (double) 1);
        basket.put("Курица\t\t", 1.320);
    }

    static void menuAction() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить продукты в корзину");
        System.out.println("2. Удалить выбранный продукт из корзины");
        System.out.println("3. Изменить кол-во продуктов в корзине");
        System.out.println("4. Очистить корзину");
        System.out.println("5. Выход из программы");
    }

    static void getProducts() {
        System.out.println("В корзине находятся продукты:" + tc_BLUE);

        for (String i : basket.keySet()) {
            System.out.printf(i + "\t" + getQuantity(i) + "\n");
        }
        System.out.println(tc_RESET);
    }

    static double getQuantity(String str) {
        double quantity = basket.get(str);
        return quantity;
    }

    static void updateProductQuantity(String product, double quantity) {

        for (Map.Entry entry : basket.entrySet()) {
            double dob = (double) entry.getValue() + quantity;
            if (dob <= 0) {
                basket.remove(product);
            } else {
                entry.setValue(dob);
            }
            break;
        }
    }
}
