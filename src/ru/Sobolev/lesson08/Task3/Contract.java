package ru.Sobolev.lesson08.Task3;

public class Contract {

    static String numberCont, dateCont;
    static String[] itemsCont;

    static void Cont() {
        numberCont = "Р001-07/20";
        dateCont = "01.06.2020";
        itemsCont = new String[4];
        itemsCont[0] = "Упаковка шурупов";
        itemsCont[1] = "Коробка саморезов";
        itemsCont[2] = "Палета гипсокартона";
        itemsCont[3] = "Мешок шпатлевки";
    }

    public static String getNumberCont() {

        return numberCont;
    }

    public static String getDateCont() {

        return dateCont;
    }

    public static String[] getItemsCont() {
        return itemsCont;
    }

}
