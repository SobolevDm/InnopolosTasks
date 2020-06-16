package ru.Sobolev.lesson04;

import java.util.Scanner;
import java.util.StringJoiner;

public class Task02 {

    public static void main(String[] args) {

        double numberDoble;
        int numberInt;
        StringJoiner answer = new StringJoiner("");

        for (; ; ) {
            System.out.print("Введите число: ");
            Scanner word = new Scanner(System.in);
            if (word.hasNextInt()) {
                numberInt = word.nextInt();
                answer.add("Введенное число является: целым ");
                //System.out.print("Введенное число является: целым, ");
                if (numberInt < 0) {
                    answer.add("отрицательным ");
                } else {
                    if (numberInt == 0) {
                        answer.add("нулевым ");
                    } else {
                        answer.add("положительным ");
                    }
                }
                if (numberInt % 2 == 0) {
                    answer.add("четным.");
                } else {
                    answer.add("не четным.");
                }
                System.out.println(answer.toString());
                break;
            } else {
                if (word.hasNextDouble()) {
                    numberDoble = word.nextDouble();

                    answer.add("Введенное число является: дробным ");
                    //System.out.print("Введенное число является: дробным , ");
                    // функция описания
                    if (numberDoble < 0) {
                        answer.add("отрицательным ");
                    } else {
                        if (numberDoble == 0) {
                            answer.add("нулевым ");
                        } else {
                            answer.add("положительным ");
                        }
                    }
                    if (numberDoble % 2 == 0) {
                        answer.add("четным.");
                    } else {
                        answer.add("не четным.");
                    }
                    System.out.println(answer.toString());
                    break;
                } else {
                    System.out.println("Необходимо вводить только цифры! Пожалуйста попробуйте еще раз.");
                }

            }


        }
    }


}
