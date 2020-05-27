package com.zad4;

/**
 * Exercise 4
 * Author: Wojtek Turek
 */

public class DemoRunners {
    public static void main(String[] args) {

        Runner athlete = new Athlete();
        athlete.run();

        Runner machine = new Machine();
        machine.run();

        Runner politician = new PoliticalCandidate();
        politician.run();
    }
}
