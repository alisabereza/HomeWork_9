package com.company.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {
    public static void mainMenuOptions() {
        System.out.println("Select action: ");
        System.out.println("0 - to shutdown ");
        System.out.println("1 - To Execute Math operation");
        System.out.println("2 - to print a list of available actions");

    }
    public static void arithmeticOperationsOptions() throws InterruptedException {
        System.out.println("Math Operations with two numbers");
        System.out.println("Enter first number (x): ");
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        try {
            x = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter second number (y): ");
            y = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception.");
            Menu.arithmeticOperationsOptions();
        }

        System.out.println("Select math operation to be executed with x & y:");
        System.out.println("1. x + y");
        System.out.println("2. x - y");
        System.out.println("3. x * y");
        System.out.println("4. x / y");
        System.out.println("5. x % y");
        System.out.println("6. x == y");
        System.out.println("7. x > y");
        System.out.println("8. x < y");
        String s = scanner.nextLine();
        Thread thread;
        thread = new Thread(new MathOps.Execution(x, y, s));
        thread.start();
        TimeUnit.SECONDS.sleep(2);
        thread.join();

    }
}
