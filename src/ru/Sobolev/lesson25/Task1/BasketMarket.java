//package ru.Sobolev.lesson25.Task1;
//
//import java.util.*;
//import java.lang.String;
//
//public class BasketMarket implements Basket {
//
//        public static int getProductQuantity (java.lang.String product){
//
//            return quantity;
//        }
//
//
//
//        /**
//         //    public void getProducts(List<String>) {// LIST!!!!
//         //        System.out.println("В корзине находятся продукты:" + tc_BLUE);
//         //
//         //        for (String i : basket.keySet()) {
//         //            System.out.printf(i + "\t" + getQuantity(i) + "\n");
//         //        }
//         //        System.out.println(tc_RESET);
//         //    }
//         */
//
//
////    public void main(String[] args) {
////        boolean exitPo = false;
////        System.out.println(tc_RED + "Ваша корзина была пуста, мы её заполнили по умолчанию." + tc_RESET);
////        for (; ; ) {
////            menuAction();
////            Scanner scan = new Scanner(System.in);
////            if (scan.hasNextInt()) {
////                int helpNum = scan.nextInt();
////                if (helpNum >= 1 && helpNum <= 5) {
////                    switch (helpNum) {
////                        case 1: { // добавить
//////                            market();
////                            System.out.println("Товар добавлен");
////                            addProduct(market());
////                            getProducts();
////                            break;
////                        }
////                        case 2: { // удалить товар
////                            //поскольку по умолчанию удаляем первую позицию делаем цикл и после удаления выходим из него
////                            //при полной реализации передавали бы String (ключ конкретного товара) для удаления
////                            for (String i : basket.keySet()) {
////                                basket.remove(i);
////                                break;
////                            }
////                            System.out.println("Товар удален");
////                            getProducts();
////                            break;
////                        }
////                        case 3: { // изменить кол-во
////                            System.out.println("Изменено кол-во");
////                            // изменяет на 1 первую позицию в корзине, если значение кол-ва <= 0 тогда удаляет позицию
////                            // по умолчанию считаем что изменяем кол-во на 1 первого товара в корзине
////                            for (Map.Entry<String, Double> i : basket.entrySet()) {
////                                updateProductQuantity(i.getKey(), -1);
////                                break;
////                            }
////                            getProducts();
////                            break;
////                        }
////                        case 4: { // очистить корзину
////
////                            removeProduct(basket);
////                            System.out.println(tc_RED + "Ваша корзина пуста!" + tc_RESET);
////                            break;
////                        }
////                        case 5: { // выход из ПО
////                            System.out.println(tc_RED + "Выход из ПО" + tc_RESET);
////                            exitPo = true;
////                            break;
////                        }
////                    }//switch
////                    if (exitPo == true) {
////                        break;
////                    }
////                } else {
////                    System.out.println("Выберите пункт меню!");
////                }
////            } else {
////                System.out.println(tc_RED + "Нужно выбрать пункт меню - введите цыфру от 1 до 5." + tc_RESET);
////            }
////        }//for (;;)
////    }//psvm
//
////    public void addProduct(String product, int quantity) { //поработать над методом!!!!
////
////
////        basket.put(product, quantity);
////    }
//
////    public void removeProduct(String product) {
////
////    }
////
//
//
////    public void Collection<String> getProducts() {
////        java.lang.String product = null, errorUser;
////        int scan;
////
////        errorUser = "Нужно выбрать пункт меню";
////        Scanner scanMenu = new Scanner(System.in);
////
////        for (; ; ) {
////            System.out.println("Выберите пункт меню товара которых хотите добавить в корзину:");
////            System.out.println("1. Морквь");
////            System.out.println("2. Молоко");
////            System.out.println("3. Картошка");
////            System.out.println("4. Сахар");
////            System.out.println("5. Корм д.к. Wiskas");
////            System.out.println("6. Шампиньоны");
////            System.out.println("7. Перец");
////            System.out.println("8. Чеснок");
////            System.out.println("9. Хлеб чёрный");
////
////            if (scanMenu.hasNextInt()) {
////                scan = scanMenu.nextInt();
////                if (scan > 0 && scan < 10) {
////                    switch (scan) {
////                        case (1): {
////                            product = "Морквь\t\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (2): {
////                            product = "Молоко\t\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (3): {
////                            product = "Картошка\t\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (4): {
////                            product = "Сахар\t\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (5): {
////                            product = "Корм д.к. Wiskas";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (6): {
////                            product = "Шампиньоны\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (7): {
////                            product = "Перец\t\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (8): {
////                            product = "Чеснок\t\t";
////                            prodList.add(product);
////                            break;
////                        }
////                        case (9): {
////                            product = "Хлеб чёрный\t";
////                            prodList.add(product);
////                            break;
////                        }
////                    }
////                    if (product != null) {
////                        break;
////                    }
////                } else {
////                    System.out.println(errorUser);
////                }
////            } else {
////                System.out.println(errorUser);
////            }
////        }return prodList;
////    }
////
//
//
////
////    public static ?market() {
//////
////
////
////}
////
//
////    public int getProductQuantity(String product){
////        int quantity = basket.get(product);
////        return quantity;
////    }
//
//
//    }
//
//
//
