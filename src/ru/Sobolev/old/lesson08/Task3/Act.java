package ru.Sobolev.old.lesson08.Task3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Act {
    public static void main(String[] args) {

        int answer = 0, counter = 0;
        boolean exit = false;

        for (; ; ) {
            System.out.printf("\nХотите создать новый Акт?\n1. Да\n2. Нет\n");
            Scanner numberAction = new Scanner(System.in);
            if (numberAction.hasNextInt()) {
                answer = numberAction.nextInt();
            } else {
                System.out.println("Нужно ввести целое число 1 или 2!");
            }
            switch (answer) {
                case (1):
                    Contract cont = new Contract();//создать объект класса Cont
                    cont.numberCont = "Р002-07/20";
                    cont.dateCont = "20.02.2020";
                    cont.itemsCont = new String[]{"Упаковка шурупов", "Коробка саморезов", "Палета гипсокартона",
                            "Мешок шпатлевки"};
                    counter++;
                    System.out.printf("\nАкт выполненных работ № %d от ", counter);
                    String dateToday = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
                    System.out.println(dateToday);
                    System.out.printf("по договору № %s от %s .\n", cont.numberCont, cont.dateCont);
                    System.out.println("В рамках договора были поставлены следующие материалы:");
                    for (int i = 0; i < cont.getItemsCont().length; i++) {
                        System.out.println(i + 1 + ". " + cont.itemsCont[i]);
                    }
                    break;
                case (2):
                    exit = true;
            }
            if (answer < 1 || answer > 2) {
                System.out.println("Нужно ввести 1 или 2");//проверить строку на актуалтность
            }
            if (exit == true) {
                break;
            }
        }//for
    }//psvm
}//main
