package ru.Sobolev.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cheque {

    public static void main(String[] args) throws FileNotFoundException {

        String fileProd = "products.txt", buf;
        int counter = 0;
        double summ = 0, number1 = 0;
        String[] str = new String[3];

/**    StringJoiner answer = new StringJoiner("");
 *
 */

        Scanner scan = new Scanner(new FileInputStream(fileProd));

        while (scan.hasNextLine()) {

            switch (counter) {
                case 0: {
                    str[counter] = scan.nextLine();
//                    counter++;
                    break;
                }
                case 1: {
                    str[counter] = scan.nextLine();
                    number1 = scan.nextDouble();
//                    counter++;
                    break;
                }
                case 2: {
                    str[counter] = scan.nextLine();
                    summ = summ + number1 * scan.nextDouble();
                    counter = 0;

                    //добавляем строку в List
                    break;
                }
            }//switch
            counter++;


        }//while

//нужно пробежаться по строкам вывода, узнать самцю длинную и по её длинне вывести символ = в начале чека и в конце
//так же при считывании чисел нужно их перемножать и загонять в переменную которая по итогу будет выводить итоговую сумму


    }


}
