package ru.Sobolev.lesson08.Task3;

public class Contract {

    String numberCont, dateCont;
    String[] itemsCont;

    public void Cont() {
        numberCont = "Р001-07/20";
        dateCont = "01.06.2020";
        itemsCont = new String[4];
        itemsCont[0] = "Упаковка шурупов";
        itemsCont[1] = "Коробка саморезов";
        itemsCont[2] = "Палета гипсокартона";
        itemsCont[3] = "Мешок шпатлевки";
    }

    public String getNumberCont() {
        return numberCont;
    }

    public void setNumberCont(String numberCont) {
        this.numberCont = numberCont;
    }

    public String getDateCont() {
        return dateCont;
    }

    public void setDateCont(String dateCont) {
        this.dateCont = dateCont;
    }

    public String[] getItemsCont() {
        return itemsCont;
    }

    public void setItemsCont(String[] itemsCont) {
        this.itemsCont = itemsCont;
    }
}
