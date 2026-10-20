package com.pluralsight;

public class Nameparser {
}
import java.util.Scanner;

public class NameParser {
    private static java.lang.Object System;

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter your name (first last OR first middle last): ");
        String fullName = input.nextLine().trim();   // Trim leading/trailing spaces

        // Split the name by spaces
        String[] parts = fullName.split("\\s+");     // Handles multiple spaces safely

        // Process based on number of parts
        if (parts.length == 2) {
            // first last
            String first = parts[0];
            String last = parts[1];

            System.out.println("First name: " + first);
            System.out.println("Last name: " + last);

        } else if (parts.length == 3) {
            // first middle last
            String first = parts[0];
            String middle = parts[1];
            String last = parts[2];

            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name: " + last);

        } else {
            System.out.println("Invalid format. Please enter either:");
            System.out.println("first last");
            System.out.println("or");
            System.out.println("first middle last");
        }

        input.close();
    }

    private static class String {
        public String[] split() {
            return split((java.lang.String) null);
        }

        public String[] split(java.lang.String string) {
            return null;
        }
    }
}