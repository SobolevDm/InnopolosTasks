package ru.Sobolev.lesson23;

public class Product {

    String nameProduct;
    int quantityProd;

    public Product(String nameProduct, int quantityProd) {
        this.nameProduct = nameProduct;
        this.quantityProd = quantityProd;
    }

    @Override
    public String toString() {
        return "nameProduct=" + nameProduct + ", quantityProd=" + quantityProd;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantityProd() {
        return quantityProd;
    }

    public void setQuantityProd(int quantityProd) {
        this.quantityProd = quantityProd;
    }
}
