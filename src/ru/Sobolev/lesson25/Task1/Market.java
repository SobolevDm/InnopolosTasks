package ru.Sobolev.lesson25.Task1;

import java.util.*;

import static ru.Sobolev.lesson25.textColor.*;

public class Market implements Basket {

    public static Market market = new Market();
    public Map<String, Integer> basket = new HashMap();
    public List<String> prodList = new ArrayList<>();

    static void menuAction() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить продукты в корзину");
        System.out.println("2. Удалить выбранный продукт из корзины");
        System.out.println("3. Изменить кол-во продуктов в корзине");
        System.out.println("4. Очистить корзину");
        System.out.println("5. Выход из программы");
    }

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.replace(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        prodList.clear();
        prodList.addAll(basket.keySet());
        return prodList;
    }

    @Override
    public int getProductQuantity(String product) {
        int quan = 0;
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            if (entry.getKey().equals(product)) {
                quan = entry.getValue();
            }
        }
        return quan;
    }

    public static String newProduct() {
        String newProd = null, errorUser = "Нужно выбрать пункт меню";
        int scan;

        Scanner scanMenu = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Выберите пункт меню товара который хотите добавить в корзину:");
            System.out.println("1. Морквь");
            System.out.println("2. Молоко");
            System.out.println("3. Картошка");
            System.out.println("4. Сахар");
            System.out.println("5. Корм д.к. Wiskas");
            System.out.println("6. Шампиньоны");
            System.out.println("7. Перец");
            System.out.println("8. Чеснок");
            System.out.println("9. Хлеб чёрный");

            if (scanMenu.hasNextInt()) {
                scan = scanMenu.nextInt();
                if (scan > 0 && scan < 10) {
                    switch (scan) {
                        case (1): {
                            newProd = "Морквь\t\t";
                            break;
                        }
                        case (2): {
                            newProd = "Молоко\t\t";
                            break;
                        }
                        case (3): {
                            newProd = "Картошка\t\t";
                            break;
                        }
                        case (4): {
                            newProd = "Сахар\t\t";
                            break;
                        }
                        case (5): {
                            newProd = "Корм д.к. Wiskas";
                            break;
                        }
                        case (6): {
                            newProd = "Шампиньоны\t";
                            break;
                        }
                        case (7): {
                            newProd = "Перец\t\t";
                            break;
                        }
                        case (8): {
                            newProd = "Чеснок\t\t";
                            break;
                        }
                        case (9): {
                            newProd = "Хлеб чёрный\t";
                            break;
                        }
                    }
                    if (newProd != null) {
                        break;
                    }
                } else {
                    System.out.println(errorUser);
                }
            } else {
                System.out.println(errorUser);
            }
        }//for product
        return newProd;
    }

    static int newQuantity(String product) {
        String errorUser = "Нужно ввести целое число от 1 до 100.";
        int newQuan = 0, scan;

        Scanner scanQuan = new Scanner(System.in);
        for (; ; ) {
            System.out.printf("Введите целое число товара %s от 1 до 100, которое хотите приобрести:", product);
            if (scanQuan.hasNextInt()) {
                scan = scanQuan.nextInt();
                if (scan > 0 && scan < 101) {
                    newQuan = scan;
                } else {
                    System.out.println(errorUser);
                }
            } else {
                System.out.println(errorUser);
            }
            if (newQuan != 0) {
                break;
            }
        }// for quantity
        return newQuan;
    }

    public static void main(String[] args) {
        boolean exitPo = false;
        String helpProd, errorString = tc_RED + "Вы ввели неверные данные." + tc_RESET;
        int count, countHelp;
//        Market market = new Market();

        for (; ; ) {
            menuAction();
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int helpNum = scan.nextInt();
                if (helpNum >= 1 && helpNum <= 5) {
                    switch (helpNum) {
                        case 1: { //
                            helpProd = newProduct();
                            market.addProduct(helpProd, newQuantity(helpProd));
                            System.out.println("Товар добавлен. В корзине находятся продукты:");
                            market.printBasket();
                            break;
                        }
                        case 2: { // удалить товар
                            System.out.printf(tc_RED + "Выберите товар, который хотите удалить из корзины.\n" + tc_RESET);
                            market.printBasket();
                            Scanner delProd = new Scanner(System.in);
                            if (delProd.hasNextInt()) {
                                countHelp = delProd.nextInt();
                                if (countHelp > 0 && countHelp <= market.getProducts().size()) {
                                    count = 1;
                                    for (String list : market.getProducts()) {
                                        if (count == countHelp) {
                                            market.removeProduct(list);
                                        }
                                        count++;
                                    }
                                } else {
                                    System.out.println(errorString);
                                }
                            } else {
                                System.out.println(errorString);
                            }
                            System.out.println("Товар удален. В корзине содержится следующий товар:");
                            market.printBasket();
                            break;
                        }
                        case 3: { // изменить кол-во
                            System.out.println("Выберите продукт у которого хотите изменить количество:");
                            market.printBasket();

                            Scanner delProd = new Scanner(System.in);
                            if (delProd.hasNextInt()) {
                                countHelp = delProd.nextInt();
                                if (countHelp > 0 && countHelp <= market.getProducts().size()) {
                                    count = 1;
                                    for (String list : market.getProducts()) {
                                        if (count == countHelp) {
                                            System.out.printf("У данного товара количество: %d\n", market.getProductQuantity(list));
                                            System.out.println("Введите новое количество товара:");
                                            Scanner newQuanScan = new Scanner(System.in);
                                            if (newQuanScan.hasNextInt()) {
                                                int newNumber = newQuanScan.nextInt();
                                                if (newNumber > 0) {
                                                    market.updateProductQuantity(list, newNumber);
                                                } else {
                                                    System.out.println(errorString);
                                                }
                                            } else {
                                                System.out.println(errorString);
                                            }
                                        }
                                        count++;
                                    }
                                } else {
                                    System.out.println(errorString);
                                }
                            } else {
                                System.out.println(errorString);
                            }
                            System.out.println("Изменено кол-во");
                            market.printBasket();
                            break;
                        }
                        case 4: { // очистить корзину
                            market.clear();
                            System.out.println(tc_RED + "Ваша корзина пуста!" + tc_RESET);
                            break;
                        }
                        case 5: { // выход из ПО
                            System.out.println(tc_RED + "До свидания!" + tc_RESET);
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

    public void printBasket() {
        int count = 1;
        for (String list : market.getProducts()) {
            System.out.printf(tc_BLUE + "%d. %s %d\n" + tc_RESET, count, list, market.getProductQuantity(list));
            count++;
        }
    }
}
