package com.zad2;
/**
 * Exercise 2
 * Author: Wojtek Turek
 */


public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius += radius * percent / 100;
    }
}
