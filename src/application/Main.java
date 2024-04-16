package application;

import entities.Ticket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        Ticket ticket = new Ticket();
        
        int choiceDestiny;

        System.out.println("Welcome to FlyAway.com");
      
        String destination = "";
        String days = "";
        String classType = "";
        
        do {
        	            
            System.out.println(ticket.mainMenuString());
            choiceDestiny = sc.nextInt();

            switch (choiceDestiny) {
                case 1:
                case 2:
                case 3:
                case 4: 
                case 5:
                	
                	destination = ticket.getDestination(choiceDestiny);
                	
                	int choiceDays;
                	
                	do {
                		
						System.out.println(ticket.menuDays());
						
						
						choiceDays = sc.nextInt();
						
						switch (choiceDays) {
						case 1:
						case 2:
						case 3:
						case 4:
							days = ticket.getChoiceDays(choiceDays);
							int choiceClass;
							
							do {
								
								System.out.println(ticket.menuClass());

								choiceClass = sc.nextInt();
								
								switch (choiceClass) {
									case 1:
									case 2: 
										classType = ticket.getClassType(choiceClass);
										
										System.out.println("\nHere is your ticket:");
										System.out.println(ticket.getTicketInfo(destination, days, classType));
										
										break;
									case 3: 
										break;
								} 	
									
							} while (choiceClass != 3);
							
							break;
						case 5: 
							break;
					}
					
				} while (choiceDays != 5); 
            	
            	break;
            	
            case 6: 
            	break;   	
            	
            default: 
            	System.out.println("Invalid Option. Please, try again.");
		}
  
      } while (choiceDestiny != 6);
        
        System.out.println("Exiting program...");
        sc.close();
    }
}