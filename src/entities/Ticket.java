package entities;

import java.time.LocalDate;

public class Ticket {
    private String origin;
    private String destination;
    private LocalDate date;
    private String days;

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
        + "\n4- Washington"
        + "\n5- Tokyo"
        + "\n6- Exit";
    }
    
    public String menuDays(){
        return "\nHow many days? "
         + "\n1- 3 days"
         + "\n2- 5 days"
         + "\n3- 7 days"
         + "\n4- 15 days"
         + "\n5- Back"
         + "\n6- Exit";
     }
    
    public String menuClass(){
        return "\nWich class? "
         + "\n1- Primeira Classe"
         + "\n2- Econômica"
         + "\n3- Back"
         + "\n4- Exit";
    }
    
    public String getDestination(int choice) {
    	switch (choice) {
		case 1:
			return "Paris";
		case 2: 
			return "Roma";
		case 3: 
			return "Buenos Aires";
		case 4:
			return "Washington";
		case 5: 
			return "Tokyo";
		default:
			return "";
		}
    }
    
    public String getChoiceDays(int days) {
    	switch (days) {
		case 1:
			return "3 days";
		case 2: 
			return "5 days";
		case 3: 
			return "7 days";
		case 4:
			return "15 days";
		default:
			return "";
		}
    }
    
    public String getClassType(int classType) {
    	switch (classType) {
		case 1:
			return "First Class";
		case 2: 
			return "Economic Class";
		default:
			return "";
		}
    }
    

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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
    
    public String getTicketInfo(String destination, String days, String classType) {
    	return "Detiny: " 
    			+ destination 
    			+ "\nDuration: " 
    			+ days 
    			+ "\nClass Type: "
    			+ classType;
    }
}
