package com.zad1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BATicket implements BATicketService {
    LocalDateTime departureTime;
    double ticketPrice;
    Airport from;
    Airport to;

    public BATicket(LocalDateTime departureTime, double ticketPrice, Airport from, Airport to) {
        this.departureTime = departureTime;
        this.ticketPrice = ticketPrice;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "BATicket{" +
                "departureTime=" + departureTime +
                ", ticketPrice=" + ticketPrice +
                ", from=" + from +
                ", to=" + to +
                '}';
    }

    @Override
    public List<BATicket> getTicketInfo(Airport from, Airport to, LocalDate when) {
        List<BATicket> baTickets = new ArrayList<>();
        return baTickets;
    }

}
