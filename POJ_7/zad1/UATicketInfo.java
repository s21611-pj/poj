package com.zad1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UATicketInfo implements UATicketService {
    LocalDateTime dateTime;
    double price;
    String from;
    String to;

    public UATicketInfo(LocalDateTime dateTime, double price, String from, String to) {
        this.dateTime = dateTime;
        this.price = price;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "UATicketInfo{" +
                "dateTime=" + dateTime +
                ", price=" + price +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public List<UATicketInfo> getTicketInfo(String from, String to, LocalDate when) {
        
        List<UATicketInfo> uaTickets = new ArrayList<>();
        return uaTickets;
    }
}
