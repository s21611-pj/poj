package com.zad1;

import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BATicket x = new BATicket(new DateTime(120, 11, 30, 23, 58), 400, new Airport("TXL878"), new Airport("GDA456"));

        System.out.println(x);

        UATicketService y = new UATicketInfo(new DateTime(120,7, 29,14, 45), 3400, "GDA345", "TXL876");

        System.out.println(y);
        

    }
}
