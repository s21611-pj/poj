package com.zad1;

public class Airport {
    String airportCode;

    public Airport(String airportCode) {
        this.airportCode = airportCode;
    }

    @Override
    public String toString() {
        return airportCode;

    }
}
