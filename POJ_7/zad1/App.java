package com.zad1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {



        Airlines ba1 = new Airlines(new BATicket(LocalDateTime.of(2020,11,2,20,58), 2000, new Airport("GDA"), new Airport("WAW")));

        Airlines ua1 = new Airlines(new UATicketInfo(LocalDateTime.of(2020,11,2,20,58), 4500,"GDA", "WAW"));

        List<Airlines> airlinesList = new ArrayList<>();
        airlinesList.add(ba1);
        airlinesList.add(ua1);

    }
}
