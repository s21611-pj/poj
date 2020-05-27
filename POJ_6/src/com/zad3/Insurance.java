package com.zad3;

/**
 * Exercise 3
 * Author: Wojtek Turek
 */

public abstract class Insurance {
    protected String type = "";
    protected double monthlyPrice = 0.0;

    public Insurance(String type, double monthlyPrice) {
        this.type = type;
        this.monthlyPrice = monthlyPrice;
    }

    public String getType() {
        return type;
    }
    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public abstract void setCost();
    public abstract void display();

}
