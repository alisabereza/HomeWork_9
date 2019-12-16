package com.company;

import com.company.Utils.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        Menu.mainMenuOptions();
        while (!exit) {
            System.out.println("Enter action (2 - to show available actions)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0: {
                    System.out.println("Shutting down...");
                    exit = true;
                    scanner.close();
                    break;
                }
                case 1: {
                    Menu.arithmeticOperationsOptions();
                    break;
                }

                case 2: {
                    Menu.mainMenuOptions();
                    break;
                }
                default: {
                    System.out.println("Incorrect input");
                    Menu.mainMenuOptions();
                }
            }
        }
    }
}
