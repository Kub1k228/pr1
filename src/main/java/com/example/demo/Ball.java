package com.example.demo;
public class Ball {
    private static final int defPrice = 1000;
    private String brand;
    private int price;

    public Ball(String b, int pr) {
        brand = b;
        price = pr;
    }

    public Ball(String b) {
        brand = b;
        price = defPrice;
    }

    public Ball() {
        brand = "NULL";
        price = defPrice;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return this.brand + " price " + this.price;
    }

    public void sale(int sale) {
        price = price - (price / 100 * sale);
    }
}
