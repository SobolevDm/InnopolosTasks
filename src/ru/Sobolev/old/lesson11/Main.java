package ru.Sobolev.old.lesson11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String inputString;
        boolean exitMain = false;

        for (; ; ) {
            System.out.println("Введите строку для анализа цензуры - бяка - :");
            Scanner scannerString = new Scanner(System.in);
            inputString = scannerString.nextLine().trim();
            int index;
            index = inputString.indexOf("бяка");
            if (index != -1) {
                System.out.println(index);
            } else {
                System.out.println("Такого совпадения нет!");
            }

            String[] chek = inputString.split("\\b");
            for (int i = 1; i <= chek.length; i++) {
                if (chek[i - 1].equalsIgnoreCase("бяка")) {
                    chek[i - 1] = (MyColor.ANSI_RED + "<вырезано цензурой>" + MyColor.ANSI_RESET);
                }
                System.out.printf(chek[i - 1]);
            }
            System.out.println("\n\nХотите ввести новую строку? Если да - введите <да>, иначе любое слово или символ.");
            Scanner newString = new Scanner(System.in);
            inputString = newString.nextLine();
            if (inputString.equals("да")) {
                exitMain = false;
            } else {
                exitMain = true;
            }
            if (exitMain == true) {
                break;
            }
        }//for(;;)
    }//psvm

    class MyColor {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
    }
}//Main
