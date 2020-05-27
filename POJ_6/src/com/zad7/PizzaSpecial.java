package com.zad7;

import java.util.Locale;

/**
 * Exercise 7
 * Author: Wojtek Turek
 */

public class PizzaSpecial extends Pizza {

    private int size;
    private boolean italianCrust;
    private boolean extraCheese;

    public PizzaSpecial(double calories, String name, double price){
        super(calories, name, price);
    }

    public PizzaSpecial(double calories, String name, double price, int size, boolean italianCrust, boolean extraCheese) {
        super(calories, name, price);
        this.size = size;
        this.italianCrust = italianCrust;
        this.extraCheese = extraCheese;
    }

    public int getSize() {
        return size;
    }

    public boolean isItalianCrust() {
        return italianCrust;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void doubleSize() {
        this.size = this.size * 2;
    }

    public void changeCheese() {
        extraCheese = !extraCheese;
    }

    public void changeCrust() {
        italianCrust = !italianCrust;
    }



    @Override
    public String toString() {
        return String.format(Locale.US, "PizzaSpecial[name=%s, size=%d, " +
                        "price=%.2f, " + "calories=%.1f, " +
                        "italianCrust=%b, extraCheese=%b]",
                this.getName(), getSize(), this.getPrice(), this.getCalories(), isItalianCrust(), isExtraCheese());
    }
}
