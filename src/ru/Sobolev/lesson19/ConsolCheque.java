package ru.Sobolev.lesson19;

import java.io.Serializable;

public class ConsolCheque implements Serializable {

    private String name;
    private int price, count, summ; //Наименование        Цена   Кол-во    Стоимость

    public ConsolCheque(String name, int price, int count, int summ) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.summ = summ;
    }

    @Override
    public String toString() {
        return "ConsolCheque{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", summ=" + summ +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }
}
