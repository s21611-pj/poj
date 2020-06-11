package com.zad1;

import java.util.Date;
import java.util.List;

public class UATicketInfo implements UATicketService {
    DateTime dateTime;
    double price;
    String from;
    String to;

    public UATicketInfo(DateTime dateTime, double price, String from, String to) {
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
    public List<UATicketInfo> getTicketInfo(String from, String to, Date when) {
        return null;
    }
}
