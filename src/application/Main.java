package application;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to FlyAway.com");

        int choice;
        do {
            System.out.println("Choose a option: "
                    + "1- Purchase a ticket "
                    + "2- Look the available trips"
                    + "3- Cancel a ticket purchase"
                    + "4- Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int a;
                case 2:
                    int b;
                case 3:
                    int c;
            }
        } while (choice != 4);

        sc.close();
    }
}