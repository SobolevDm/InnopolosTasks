package ru.Sobolev.lesson04;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        boolean exit = false;
        for (; ; ) {
            if (exit == true) {
                break;
            }
            String answer = "Введите число 1 или 2. Пожалуйста попробуйте еще раз.";
            int progress = 0;
            System.out.printf("Выберите какой тип прогрессии хотите вывести. Нажмите нужную цифру.");
            System.out.printf("\n 1. Арифметическая.");
            System.out.printf("\n 2. Геометрическая. \n"); // Знаменатель прогрессии по умолчанию будет равен 2
            Scanner word = new Scanner(System.in);
            if (word.hasNextInt()) {
                progress = word.nextInt();
                if ((progress == 1) || (progress == 2)) {
                    for (; ; ) {
                        System.out.println("Введите чило для которого необходимо вывести прогрессию.");
                        Scanner wordNumber = new Scanner(System.in);
                        if (wordNumber.hasNextDouble()) {
                            double number, numberN;
                            number = wordNumber.nextLong();
                            numberN = 1;
                            for (int count = 1; count < 16; count++) {
//                                if (count == 1){
//                                    numberN = count;
//                                }
                                if (progress == 1) {
                                    System.out.printf(numberN + " ");
                                    numberN = numberN + number;
                                }
                                if (progress == 2) {
                                    System.out.printf(numberN + " ");
                                    numberN = numberN * number;
                                }
                            }
                            exit = true;
                            break;
                        } else {
                            System.out.println("Необходимо ввести число. Попробуйте еще раз.");
                        }

                    }

                } else {
                    System.out.println(answer);
                }


            } else {
                System.out.println(answer);
            }
        }


    }
}
