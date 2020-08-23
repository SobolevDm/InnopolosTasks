package ru.Sobolev.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cheque {

    public static int lenghtName = 0, lenghtQuantity = 0, lenghtPrice = 0, lengthCost = 0;

    public static void main(String[] args) throws FileNotFoundException {

        String fileProd = "products.txt", buf;
        int counter = 0;
        double summ = 0, number1 = 0;
        String[] str = new String[3];

/**    StringJoiner answer = new StringJoiner("");
 *
 */
        FileMaxLenght();

        System.out.println(getLenghtName());
        System.out.println(getLenghtQuantity());
        System.out.println(getLenghtPrice());
        System.out.println(getLengthCost());

        Scanner scan = new Scanner(new FileInputStream(fileProd));

        while (scan.hasNextLine()) {

            switch (counter) {
                case 0: {
                    str[counter] = scan.nextLine();
                    break;
                }
                case 1: {
                    str[counter] = scan.nextLine();
                    number1 = Double.valueOf(str[counter]);
                    break;
                }
                case 2: {
                    str[counter] = scan.nextLine();
                    summ = summ + number1 * Double.valueOf(str[counter]);
                    counter = -1;
                    if (str[0].length() < 12) {
                        System.out.printf("%s %16s %s =%10.2f\n", str[0], str[1], str[2], Double.valueOf(str[1]) * Double.valueOf(str[2]));
                    } else {
                        System.out.printf("%s %8s %s =%10.2f\n", str[0], str[1], str[2], Double.valueOf(str[1]) * Double.valueOf(str[2]));
                    }
//                    System.out.printf("%s\t\t%s %10s =%10.2f\n", str[0], str[1], str[2], Double.valueOf(str[1])*Double.valueOf(str[2]));
                    break;
                }
            }//switch
            counter++;


        }//while
        scan.close();
//нужно пробежаться по строкам вывода, узнать самцю длинную и по её длинне вывести символ = в начале чека и в конце
//так же при считывании чисел нужно их перемножать и загонять в переменную которая по итогу будет выводить итоговую сумму

    }

    public static int getLenghtName() {
        return lenghtName;
    }

    public static int getLenghtQuantity() {
        return lenghtQuantity;
    }

    public static int getLenghtPrice() {
        return lenghtPrice;
    }

    public static int getLengthCost() {
        return lengthCost;
    }

    private static void FileMaxLenght() throws FileNotFoundException {

        Scanner scan = new Scanner(new FileInputStream("products.txt"));
        String str1, str2, str3, str4;
        while (scan.hasNextLine()) {
            str1 = scan.nextLine();
            str2 = scan.nextLine();
            str3 = scan.nextLine();
            if (str1.length() > lenghtName) {
                lenghtName = str1.length();
            }
            if (str2.length() > lenghtQuantity) {
                lenghtQuantity = str2.length();
            }
            if (str3.length() > lenghtPrice) {
                lenghtPrice = str3.length();
            }
            str4 = "" + Double.valueOf(str2) * Double.valueOf(str3);
            if (str4.length() > lengthCost) {
                lengthCost = str4.length();
            }
        }
        scan.close();
    }
}