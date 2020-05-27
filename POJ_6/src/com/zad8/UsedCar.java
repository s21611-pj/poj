package com.zad8;
/**
 * Exercise 8
 * Author: Wojtek Turek
 */

public class UsedCar {
    private String VIN;
    private String make;
    private int year;
    private int mileage;
    private int price;

    public UsedCar(String VIN, String make, int year, int mileage, int price) throws Exception  {

        if (!VIN.matches("\\d") && VIN.length() != 4) throw new UsedCarException("VIN REQUIRES 4 DIGITS");
        if (year < 1997 || year > 2017) throw new UsedCarException("YEAR OF PRODUCTION IS NOT BETWEEN 1997-2017");
        if (mileage < 0 || price < 0) throw new UsedCarException("NO NEGATIVES");

        switch (make) {
            case "Ford": case "Honda": case "Toyota": case "Chrysler": case "Other":
                this.make = make;
                break;
            default:
                throw new UsedCarException("WRONG MAKE");
        }

        this.VIN = VIN;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "VIN=" + VIN +
                ", make=" + make +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
