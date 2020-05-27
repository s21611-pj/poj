package com.zad3;

import java.util.Scanner;

/**
 * Exercise 3
 * Author: Wojtek Turek
 */

public class UseInsurance {
    public static void main(String[] args) {

        Insurance insurance;

        System.out.println("[1] - Life Insurance\n[2] - Health Insurance");
        int option = new Scanner(System.in).nextInt();

        switch(option) {
            case 1:
                insurance = new Life();
                insurance.setCost();
                insurance.display();
                break;
            case 2:
                insurance = new Health();
                insurance.setCost();
                insurance.display();
                break;
            default:
                break;
        }
    }
}
