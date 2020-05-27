package com.zad6;
/**
 * Exercise 6
 * Author: Wojtek Turek
 */

public abstract class Loan implements LoanConstants {

    protected int loanID;
    protected String customerName;
    protected double loanAmount;
    protected int term;
    protected double interestRate;

    public Loan(int loanID, String customerName, double loanAmount, int term) {

        this.loanID = loanID;
        this.customerName = customerName;
        this.loanAmount = loanAmount;

        if(term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanID=" + loanID +
                ", customerName='" + customerName + '\'' +
                ", loanAmount=" + loanAmount +
                ", term='" + term + '\'' +
                '}';
    }
}