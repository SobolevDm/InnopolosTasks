package ru.Sobolev.lesson21.Task1;

import static ru.Sobolev.lesson21.Task1.textColor.*;

public class Mass {
    static int[][] mas = new int[10][10];

    public static void main(String[] args) {
        int key = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                mas[i][j] = key++;
            }
        }
        System.out.println(tc_red + "Исходный массив:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.printf("");

        toLeft();

        System.out.println(tc_blue + "Новый массив:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("" + tc_reset);
    }

    public static void toLeft() {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < mas.length; j++) {
                mas[i][j - 1] = mas[i][j];
                if (j == mas.length - 1) {
                    mas[i][j] = 0;
                }
            }
        }
    }
}
