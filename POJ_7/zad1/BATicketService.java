package com.zad1;


import java.time.LocalDate;
import java.util.List;

public interface BATicketService {
    List<BATicket> getTicketInfo (Airport from, Airport to, LocalDate when);

}
