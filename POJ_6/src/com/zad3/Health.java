package com.zad3;

/**
 * Exercise 3
 * Author: Wojtek Turek
 */

public class Health extends Insurance {
    public Health() {
        super("Health Insurance", 0.0);
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.printf("%s\nMonthly price: %.2f$\n", type, monthlyPrice);
    }
}
