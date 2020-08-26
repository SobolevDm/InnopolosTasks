package ru.Sobolev.lesson25.Task1;

import java.util.*;

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
                            // изменяет на 1 первую позицию в корзине, если значение кол-ва < 0 тогда удаляет позицию
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

    public static void getProducts() {
        List listProd = new ArrayList(basket.keySet());
        System.out.println("В корзине находятся продукты:" + tc_BLUE);
        for (Object i : listProd) {
            System.out.println(i);
        }
        System.out.println(tc_RESET);
    }

}
