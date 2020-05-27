package com.zad6;
/**
 * Exercise 6
 * Author: Wojtek Turek
 */

import java.util.Locale;


public class BusinessLoan extends Loan {

    public BusinessLoan(int loanID, String customerName, double loanAmount, int term, double interestRate) {
        super(loanID, customerName, loanAmount, term);
        this.interestRate = interestRate + 0.01;
        if(loanAmount >= 0.0 && loanAmount <= MAX_AMOUNT) {
            this.loanAmount = loanAmount + loanAmount * this.interestRate;
        } else if(loanAmount > MAX_AMOUNT) {
            this.loanAmount = MAX_AMOUNT + MAX_AMOUNT * this.interestRate;
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.US,"Business Loan{" +
                "loanID=%d, customerName=%s, loanAmount=%.2f, " +
                "term=%d, interestRate=%.2f}",
                loanID, customerName, loanAmount, term, interestRate);
    }
}