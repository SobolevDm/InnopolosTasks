package ru.Sobolev.lesson19;

import java.io.Serializable;

public class ConsolCheque implements Serializable {

    private String name;
    private double quantity, price, cost;

    public ConsolCheque(String name, double quantity, double price, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ConsolCheque{" +
                "Наименование='" + name + '\'' +
                ", Количество=" + quantity +
                ", Цена=" + price +
                ", Стоимость=" + cost +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCount(double cost) {
        this.cost = cost;
    }
}
