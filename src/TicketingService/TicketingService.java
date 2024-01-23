package TicketingService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketingService {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String personName;
        int counter = 0;
        int youPosition = 0;

        Queue<String> peopleInQueue = new LinkedList<>();

        personName = scan.nextLine();
        while (!personName.equals("-1")) {
            // TODO: Add personName to peopleInQueue and
            //       determine position of "You" (youPosition)
            peopleInQueue.add(personName);
            counter++;
            if (personName.equals("You")) {
                youPosition = counter;
            }

            personName = scan.nextLine();
        }

        System.out.println("Welcome to the ticketing service... ");
        System.out.println("You are number " + youPosition + " in the queue.");

        // TODO: In a loop, remove head person from peopleInQueue,
        //       output their name and that they have purchased a ticket,
        //       then output your position in the queue. When you are at
        //       the head, output that you can purchase your ticket.
        while (youPosition > 1) {
            System.out.println(peopleInQueue.remove() + " has purchased a ticket.");
            --youPosition;
            System.out.println("You are now number " + youPosition);

        }
        System.out.println("You can now purchase your ticket!");

    }
}