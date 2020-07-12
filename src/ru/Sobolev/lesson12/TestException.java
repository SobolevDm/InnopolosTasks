package ru.Sobolev.lesson12;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        int inputInt = 0;
        String answer = (MyColor.ANSI_RED + "Необходимо ввести номер пункта меню от 1 до 4." + MyColor.ANSI_RESET);

        for (; ; ) {
            String start = "Hello World!";
            System.out.println(start);
            System.out.println("Какую ошибку смоделировать:");
            System.out.println("1. NullPointerException");
            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("3. Свою ошибку с оператором throw");
            System.out.println("4. Выход");
            Scanner scannerString = new Scanner(System.in);
            if (scannerString.hasNextInt()) {
                inputInt = scannerString.nextInt();
                if (inputInt >= 1 && inputInt <= 3) {
                    switch (inputInt) {
                        case (1): {
                            try {
                                System.out.println(MyColor.ANSI_BLUE + "Обработка ошибки NullPointerException");
                                String helpStr = null;
                                helpStr.equals(start);
                            } catch (NullPointerException e) {
                                System.out.println("Ошибка вызванная: " + e.getMessage() + MyColor.ANSI_RESET);
                            }
                            break;
                        }
                        case (2): {
                            try {
                                System.out.println(MyColor.ANSI_BLUE + "Обработка ошибки ArrayIndexOutOfBoundsException");
                                String[] book = new String[2];
                                System.out.println(book[3]);
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Ошибка неверного индекса массива: " + e.getMessage()
                                        + MyColor.ANSI_RESET);
                            }
                            break;
                        }
                        case (3): {
                            try {
                                System.out.println(MyColor.ANSI_BLUE + "Обработка cвой ошибки с оператором throw");
                                throw new NullPointerException("Исключение моего метода.");
                            } catch (NullPointerException e) {
                                System.out.println(e.getMessage() + MyColor.ANSI_RESET);
                            }
                            break;
                        }
                    }
                } else {
                    if (inputInt != 4) {
                        System.out.println(answer);
                    }
                }
            } else {
                System.out.println(answer);
            }
            if (inputInt == 4) {
                System.out.println(MyColor.ANSI_BLUE + "До свидания!" + MyColor.ANSI_RESET);
                break;
            }
        }
    }

    class MyColor {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_BLUE = "\u001B[34m";
    }
}
