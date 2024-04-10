package entities;

import java.util.Random;

public class Trips {
    private String destination;

    Random random = new Random();
    int x = random.nextInt(900000);
    String y;

    public Trips (){

    }

    public String toString(){
        y = String.format("%06d", x);
        return "Nº: "
        + x 
        + "\nDestination: Buenos Aires"
        + "\n7 days";
    }
}
