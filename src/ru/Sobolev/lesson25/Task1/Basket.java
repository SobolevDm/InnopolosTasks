package ru.Sobolev.lesson25.Task1;

import java.util.List;

interface Basket { //интерфейсы перечитай

    void addProduct(String product, int quantity);

    void removeProduct(String product); //+

    void updateProductQuantity(String product, int quantity);//+

    void clear();//+

    List<String> getProducts();

    int getProductQuantity(String product);

}


