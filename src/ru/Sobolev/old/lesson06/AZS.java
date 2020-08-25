package ru.Sobolev.old.lesson06;

import java.util.Scanner;

public class AZS {
//    private static Tanker tanker1;
//    private static Tanker tanker2;
//    private static Tanker tanker3;

//    private Tanker tanker1; // не совсем понял почему IDEA создала эту строку

    public static void main(String[] args) {
        // Класс АЗС, заправочная станция наследует вид доплива из класса Fuel
        // и пополняетя топливом из бензовоза класс Tanker
        Tank tankAi95 = new Tank(10000);
        Tank tankAi92 = new Tank(10000);
        Tank tankDt = new Tank(30000);

        tankAi95.setVolume(0);
        tankAi92.setVolume(0);
        tankDt.setVolume(0);

        int choice;

        System.out.printf("АИ-95 = %d; АИ-92 = %d", tankAi95.getVolume(), tankAi92.getVolume());
        System.out.printf("ДТ = %d \n", tankDt.getVolume());
        System.out.println("АЗС пуста, хотите вызвать бензовоз? \n 1 - да  2 - нет");

        Scanner word = new Scanner(System.in);
        choice = word.nextInt();
        if (choice == 1) {
            tankAi95.setVolume(tankAi95.getVolume() + 5000);
            tankAi92.setVolume(tankAi92.getVolume() + 5000);
            tankDt.setVolume(tankDt.getVolume() + 15000);

        }
        System.out.println(tankAi95.getVolume());
        System.out.println(tankAi92.getVolume());
        System.out.println(tankDt.getVolume());

        //@TODO реализовать процесс продажи топлива с уменьшением его в резервуарах


    }

}
