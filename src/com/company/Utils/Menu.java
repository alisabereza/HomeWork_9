package com.company.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void mainMenuOptions() {
        System.out.println("Select action: ");
        System.out.println("0 - to shutdown ");
        System.out.println("1 - To Execute Math operation");
        System.out.println("2 - to print a list of available actions");

    }

    public static void arithmeticOperationsOptions() {
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
        switch (s.replace(" ", "")) {
            case "+":
                MathOps.addition(x, y);
                break;
            case "-":
                MathOps.substraction(x, y);
                break;
            case "*":
                MathOps.multiplication(x, y);
                break;
            case "/":
                MathOps.division(x, y);
                break;
            case "%":
                MathOps.reminder(x, y);
                break;
            case "==":
                MathOps.equality(x, y);
                break;
            case ">":
                MathOps.moreThan(x, y);
                break;
            case "<":
                MathOps.lessThan(x, y);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
