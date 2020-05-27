package com.zad6;
/**
 * Exercise 6
 * Author: Wojtek Turek
 */

import java.util.ArrayList;
import java.util.Scanner;


public class CreateLoans {
    public static void main(String[] args) {
        final int MAX_LOANS = 5;

        ArrayList<Loan> loanList = new ArrayList<>();

        while(loanList.size() !=MAX_LOANS) {

            Scanner input = new Scanner(System.in);

            System.out.println("podaj wysokosc stopy procentowej");
            double interestRate = input.nextDouble() / 100;

            System.out.println("[1] - Business Loan\n[2] - Personal Loan");
            int choice = input.nextInt();

            System.out.println("podaj id pozyczki");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("podaj imie klienta");
            String name = input.nextLine();

            System.out.println("podaj kwote pozyczki (max 100k)");
            double amount = input.nextDouble();

            System.out.println("podaj okres kredytowania");
            int term = input.nextInt();
            System.out.println("Loan No. " +(loanList.size()+1) + " saved");

            switch(choice) {
                case 1:
                    loanList.add(new BusinessLoan(id,name,amount,term, interestRate));
                    break;
                case 2:
                    loanList.add(new PersonalLoan(id,name,amount,term, interestRate));
                    break;
                default:
                    break;
            }
        }

        for (Loan i : loanList) {
            System.out.println(i.toString());
        }
    }

}