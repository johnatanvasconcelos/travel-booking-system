package entities;

import java.time.LocalDate;

public class Ticket {
    private String origin;
    private int destination;
    private LocalDate date;

    public Ticket(){

    }

    public Ticket(String origin, String destination, LocalDate date){
        this.origin = origin;
        this.date = date;
    }

    public String mainMenuString(){
       return "\nChoose your destination: "
        + "\n1- Buenos Aires "
        + "\n2- Paris"
        + "\n3- Roma"
        + "\n\n4- Exit";
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
