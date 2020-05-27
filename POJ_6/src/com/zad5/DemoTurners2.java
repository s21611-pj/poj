package com.zad5;
/**
 * Exercise 5
 * Author: Wojtek Turek
 */

public class DemoTurners2 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        leaf.turn();
        Turner page = new Page();
        page.turn();
        Turner pancake = new Pancake();
        pancake.turn();
        Turner cassetteTape = new CassetteTape();
        cassetteTape.turn();
        Turner key = new Key();
        key.turn();
    }
}
