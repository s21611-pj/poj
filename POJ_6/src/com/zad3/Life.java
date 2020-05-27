package com.zad3;

/**
 * Exercise 3
 * Author: Wojtek Turek
 */

public class Life extends Insurance {

    public Life() {
        super("Life Insurance", 0.0);
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 36;
    }

    @Override
    public void display() {
        System.out.printf("%s\nMonthly price: %.2f$\n", type, monthlyPrice);
    }
}
