package com.zad5;
/**
 * Exercise 5
 * Author: Wojtek Turek
 */

public class CassetteTape implements Turner {
    @Override
    public void turn() {
        System.out.println("Changing cassette's side");
    }
}
