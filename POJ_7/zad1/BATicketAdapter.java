package com.zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BATicketAdapter implements UATicketService {

    BATicket baTicket;

    public BATicketAdapter(BATicket baTicket) {
        this.baTicket = baTicket;
    }

    @Override
    public String toString() {
        return baTicket.toString();
    }

    @Override
    public List<UATicketInfo> getTicketInfo(String from, String to, LocalDate when) {
        List<UATicketInfo> baTickets = new ArrayList<>();
        return baTickets;
    }
}
