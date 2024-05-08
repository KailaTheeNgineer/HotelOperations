package com.pluralsight;

import java.util.Scanner;

public class HotelOperations {
    public static void main(String[] args) {

        boolean homeScreen = true;
        while (homeScreen) {
            System.out.println("Welcome to The Hotel");
            System.out.println("To begin, Select a room type.");
            Scanner myScanner = new Scanner(System.in);
            System.out.println("King - Price per night:  $139.00\nDouble - Price per night: $124.00");
            System.out.println("*weekend price increase 10%*");
            System.out.println("\n\nEnter X to Exit");
            String homeInput = myScanner.nextLine();

            if (homeInput.equalsIgnoreCase("King")) {
              @org.junit.jupiter.api.Test  
              String test1 = "King";
                assertEquals(test1);


            } else if (homeInput.equalsIgnoreCase("Double")) {

            } else if (homeInput.equalsIgnoreCase("x")) {

                homeScreen = false;
            } else {
                System.out.println("Enter a Valid Option");
                homeScreen = true;


            }


        }
    }

    private static void assertEquals(String test1) {
    }


}
