package application;

import java.sql.SQLOutput;
import entities.Ticket;
import entities.Trips;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket ticket;
        Trips trips;

        System.out.println("Welcome to FlyAway.com");

        int choice;
        do {
            ticket = new Ticket();
            trips = new Trips();
            
            System.out.println(ticket.mainMenuString());

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Here is your ticket: ");
                    System.out.println(trips);
                case 2:
                    int b;
                case 3:
                    int c;
            }
        } while (choice != 4);
        
        sc.close();
    }
}