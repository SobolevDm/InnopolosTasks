package ru.Sobolev.lesson07;

import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Work {

    public static void main(String[] args) {
        Date date = new Date();
        String dataStr = String.format("Московское время %tc", date);
        System.out.println(dataStr); // Вывод текущей даты


        TimeZone.setDefault(TimeZone.getTimeZone("Europ"));
        // В дальнейшем нужно разобраться как ставить конкретный часовой пояс (GMT+1)
        Date dataNewZone = new Date();
        String dataStrNew = String.format("Европейское время %tc", dataNewZone);
        System.out.println(dataStrNew); // Вывод текущей даты

        boolean power = false; //При попытке сделать рrivate подчеркивает красным, почему?
        int score = 0; //Переменная внутреннего счета клиента
        int wordInt = -1; // Переменная для обработки реакции пользователя

        for (; ; ) {

            //@TODO Организовать вывод часового пояса

            System.out.printf("Выберите желаемый напиток. Аппарат сдачи не выдает.\n");
            System.out.printf("На Вашем счете должно быть достаточно средств. Сейчас на Вашем счете: " + score + "₽.\n");
            for (Drinks s : Drinks.values()) { // Вывод меню напитков и их стоимости
                System.out.printf("%d. %s %d₽\n", s.ordinal() + 1, s.nameDrink, s.priceDrink);
            }
            System.out.println("5. Для пополнения счета нажмите 0.");

            Scanner wordInput = new Scanner(System.in);
            if (wordInput.hasNextInt()) { //wordInput - переменная для введенного параметра пользователя
                wordInt = wordInput.nextInt();
                if (wordInt >= 0 && wordInt <= 4) {
                    if (wordInt == 0) {
                        System.out.println("Введите сумму на которую хотите пополнить счет:");
                        Scanner wordScore = new Scanner(System.in); //wordScore - переменная для пополнения внутреннего счета
                        if (wordScore.hasNextInt()) {
                            int wordScoreHelp; //Без объявления этой переменной и дальнейшим использованием wordScore.nextInt()
                            //даже в if отработка проходила, но прибавление нет - ПО зависало. Особенность Сканера?
                            // Он не может долго держать в памяти введенную переменную?
                            wordScoreHelp = wordScore.nextInt();
                            if (wordScoreHelp > 0) {
                                score += wordScoreHelp;
                            } else {
                                System.out.println("Аппарат сдачи не выдает. Введите положительное целое число.");
                            }
                        } else {

                            System.out.println("Неверный формат Выбора. Если хотите завершить работу наберите 'выход'.");
                        }
                    } else {
                        for (Drinks s : Drinks.values()) { // Определение стоимости выбранного напитка
                            if (s.ordinal() == wordInt - 1) {
                                if (s.priceDrink <= score) {
                                    score -= s.priceDrink;
                                    System.out.printf("Возьмите Ваш %s! Приятного Аппетита!\n", s.nameDrink);
                                } else {
                                    System.out.println("На Вашем счете недостаточно средств. Пожалуйста пополните счет.");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Сделан ошибочный выбор. Такого напитка нет в продаже.");
                }
            } else {
                String strHelp1 = "exit", strHelp2 = "выход", strHelp0;
                strHelp0 = wordInput.nextLine();
                if (strHelp0.equalsIgnoreCase(strHelp1)) {
                    break;
                } else {
                    if (strHelp0.equalsIgnoreCase(strHelp2)) {
                        break;
                    } else {
                        System.out.printf("Аппарат не может обработать Ваш запрос. ");
                        System.out.println("Для выхода наберите 'выход' или 'exit'.\n");
                    }
                }
            }
        }
    }
}

