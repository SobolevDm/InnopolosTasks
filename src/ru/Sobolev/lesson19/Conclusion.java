package ru.Sobolev.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conclusion {

    public static void main(String[] args) throws FileNotFoundException {
        String fileProd = "products.txt";

        String name, quantity;
        double price, cost, summ = 0;

        Scanner scan = new Scanner(new FileInputStream(fileProd));

        List<ConsolCheque> cc = new ArrayList<>();

        System.out.println("Наименование         Цена   Кол-во    Стоимость");
        for (int j = 0; j < 47; j++) {
            System.out.printf("=");
        }
        System.out.println("");

        while (scan.hasNextLine()) {
            name = scan.nextLine();
            quantity = scan.nextLine();
            price = Double.valueOf(scan.nextLine());
            cost = Double.valueOf(quantity) * price;
            cc.add(new ConsolCheque(name, quantity, price, cost));
        }//while
        scan.close();
        int indent1, indent2, indent3, indent4;

        for (ConsolCheque i : cc) {
            indent1 = 18 - i.getName().length();
            indent2 = 6 - i.getQuantity().length();
            indent3 = 7 - String.format("%.2f", i.getPrice()).length();
//            indent3 = 7 - String.format("%5s", i.getPrice()).length(); - строка из 5 символов
            //  StringBuilder - перенос длинного названия, посмотри!!!! Есть чек по переносу строки
            indent4 = 12 - String.format("%.2f", i.getCost()).length();

            System.out.printf(i.getName());
            for (int j = 0; j < indent1 + indent3; j++) {
                System.out.printf(" ");
            }
            System.out.printf("%.2f x ", i.getPrice());
            for (int j = 0; j < indent2; j++) {
                System.out.printf(" ");
            }
            System.out.printf(i.getQuantity());
            for (int j = 0; j < indent4; j++) {
                System.out.printf(" ");
            }
            System.out.printf("=%.2f\n", i.getCost());
            summ = summ + i.getCost();
        }//for
        for (int j = 0; j < 47; j++) {
            System.out.printf("=");
        }
        System.out.println("");
        System.out.printf("Итого:");
        for (int j = 0; j < 41 - String.format("%.2f", summ).length(); j++) {
            System.out.printf(" ");
        }
        System.out.printf("%.2f\n", summ);
    }
}
