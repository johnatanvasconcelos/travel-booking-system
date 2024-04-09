package entities;

import java.time.LocalDate;

public class Ticket {
    private String origin;
    private String destination;
    private double price;
    private LocalDate date;

    public Ticket(String origin, String destination, LocalDate date){
        this.origin = origin;
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
