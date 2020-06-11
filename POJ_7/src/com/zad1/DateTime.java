package com.zad1;


import java.util.Date;

public class DateTime {
    private int year;
    private int month;
    private int day;
    private int hrs;
    private int min;
    private Date dateTime;

    public DateTime(int year, int month, int day, int hrs, int min) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hrs = hrs;
        this.min = min;
        this.dateTime = new Date(year, month, day, hrs, min);
    }

    @Override
    public String toString() {
        return dateTime.toString();
    }

    public static void main(String[] args) {
        DateTime data = new DateTime(120, 11, 30, 23, 59);
        System.out.println(data);
    }
}
