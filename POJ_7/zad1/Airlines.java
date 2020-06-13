package com.zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Airlines {

    BATicket baTicket;
    BATicketAdapter baAirlines;
    UATicketInfo uaAirlines;


    public Airlines(BATicket baTicket) {
        this.baTicket = baTicket;
        this.baAirlines = new BATicketAdapter(baTicket);
    }

    public Airlines(UATicketInfo uaAirlines) {
        this.uaAirlines = uaAirlines;
    }

    public List<Airlines> getTicketInfo(String from, String to, LocalDate when) {
        List<Airlines> ticketInfos = new ArrayList<>();
        return ticketInfos;
    }



}
