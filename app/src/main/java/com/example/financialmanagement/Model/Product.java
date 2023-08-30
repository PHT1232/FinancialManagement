package com.example.financialmanagement.Model;

public class Product {
    private int id;
    private String ProductName;
    private int Quantity;
    private float Price;
    private float FinalPrice;

    public Product() {

    }

    public Product(int id, String productName, int quantity, float price, float finalPrice) {
        this.id = id;
        ProductName = productName;
        Quantity = quantity;
        Price = price;
        FinalPrice = finalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public float getFinalPrice() {
        return FinalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        FinalPrice = finalPrice;
    }
}
