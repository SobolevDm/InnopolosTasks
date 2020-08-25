package ru.Sobolev.old.lesson14;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Works {

    public static void main(String[] args) throws FileNotFoundException {

        System.setErr(new PrintStream("errorLog14.log"));
        String str;

        Date date = new Date();
        String dataStr = String.format("Московское время %tc", date);
        System.out.println(dataStr);
        TimeZone.setDefault(TimeZone.getTimeZone("Europ"));
        Date dataNewZone = new Date();
        String dataStrNew = String.format("Европейское время %tc", dataNewZone);
        System.out.println(dataStrNew);
        System.err.println(SDF.getSdf(dataStrNew));
        int score = 0;
        int wordInt = -1;

        for (; ; ) {
            //@TODO Организовать вывод часового пояса
            System.out.printf("Выберите желаемый напиток. Аппарат сдачи не выдает.\n");
            System.out.printf("На Вашем счете должно быть достаточно средств. Сейчас на Вашем счете: " + score + "₽.\n");
            for (ru.Sobolev.old.lesson14.Drinks s : ru.Sobolev.old.lesson14.Drinks.values()) {
                System.out.printf("%d. %s %d₽\n", s.ordinal() + 1, s.nameDrink, s.priceDrink);
            }
            System.out.println("5. Для пополнения счета нажмите 0.");

            Scanner wordInput = new Scanner(System.in);
            if (wordInput.hasNextInt()) {
                wordInt = wordInput.nextInt();
                if (wordInt >= 0 && wordInt <= 4) {
                    if (wordInt == 0) {
                        System.out.println("Введите сумму на которую хотите пополнить счет:");
                        Scanner wordScore = new Scanner(System.in);
                        if (wordScore.hasNextInt()) {
                            int wordScoreHelp;
                            wordScoreHelp = wordScore.nextInt();
                            if (wordScoreHelp > 0) {
                                score += wordScoreHelp;
                            } else {
                                System.out.println("Аппарат сдачи не выдает. Введите положительное целое число.");
                            }
                        } else {
                            str = "Неверный формат Выбора. Если хотите завершить работу наберите 'выход'.";
                            System.out.println(str);
                            System.err.println(SDF.getSdf(str));
                        }
                    } else {
                        for (ru.Sobolev.old.lesson14.Drinks s : Drinks.values()) {
                            if (s.ordinal() == wordInt - 1) {
                                if (s.priceDrink <= score) {
                                    score -= s.priceDrink;
                                    System.out.printf("Возьмите Ваш %s! Приятного Аппетита!\n", s.nameDrink);
                                    System.err.println(SDF.getSdf("Выдан напиток " + s.nameDrink));
                                } else {
                                    str = "На Вашем счете недостаточно средств. Пожалуйста пополните счет.";
                                    System.out.println(str);
                                    System.err.println(SDF.getSdf(str));
                                }
                            }
                        }
                    }
                } else {
                    str = "Сделан ошибочный выбор. Такого напитка нет в продаже.";
                    System.out.println(str);
                    System.err.println(SDF.getSdf(str));
                    System.err.println(SDF.getSdf("Пользователь ввел: " + wordInt));
                }
            } else {
                String strHelp1 = "exit", strHelp2 = "выход", strHelp0;
                strHelp0 = wordInput.nextLine();
                if (strHelp0.equalsIgnoreCase(strHelp1)) {
                    System.err.println(SDF.getSdf("Завершение работы."));
                    break;
                } else {
                    if (strHelp0.equalsIgnoreCase(strHelp2)) {
                        System.err.println(SDF.getSdf("Завершение работы."));
                        break;
                    } else {
                        str = "Аппарат не может обработать Ваш запрос. ";
                        System.out.printf(str);
                        System.err.println(SDF.getSdf(" " + str));
                        System.err.println(SDF.getSdf("пользователь ввел: " + strHelp0));
                        System.out.println("Для выхода наберите 'выход' или 'exit'.\n");
                    }
                }
            }
        }
    }
}
