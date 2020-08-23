package ru.Sobolev.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conclusion {

    public static void main(String[] args) throws FileNotFoundException {
        String fileProd = "products.txt";

        String name;
        double quantity, price, cost;

        Scanner scan = new Scanner(new FileInputStream(fileProd));
        int counter = 0;

//        Arrays cc = new Arrays(ConsolCheque);
        List<ConsolCheque> cc = new ArrayList<>();

        while (scan.hasNextLine()) {
            name = scan.nextLine();
            quantity = Double.valueOf(scan.nextLine());
            price = Double.valueOf(scan.nextLine());
            cost = quantity * price;
            counter++;
            cc.add(new ConsolCheque(name, quantity, price, cost));
        }//while
        scan.close();

        for (ConsolCheque i : cc) {
            System.out.println(i.getName());
//            System.out.println(i);
        }


    }
}
