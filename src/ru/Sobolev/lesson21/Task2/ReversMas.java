package ru.Sobolev.lesson21.Task2;

import static ru.Sobolev.lesson21.Task2.textColor.*;

public class ReversMas {
    public static void main(String[] args) {

        int ii = 5, jj = ii;
        int[][] mas = new int[ii][jj];

        int key = 1;
        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < jj; j++) {
                mas[i][j] = key++;
            }
        }

        System.out.println(tc_red + "Исходный массив:");
        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < jj; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.printf("" + tc_reset);

        int help, keyHelp;
        for (int i = 0; i < ii; i++) {
            keyHelp = 1;
            for (int j = 0; j < jj / 2; j++) {
                help = mas[i][j];
                mas[i][j] = mas[i][jj - keyHelp];
                mas[i][jj - keyHelp] = help;
                keyHelp++;
            }
        }

        System.out.println(tc_blue + "Новый массив:");
        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < jj; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.printf("" + tc_reset);
    }
}
