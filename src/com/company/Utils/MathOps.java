package com.company.Utils;

public class MathOps {
    public static void addition(double x, double y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public static void substraction(double x, double y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }

    public static void multiplication(double x, double y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }

    public static void division(double x, double y) {
        if (y == 0) {
            System.out.println("Can't divide by 0.");
        } else {
            System.out.println(x + " / " + y + " = " + (x / y));
        }
    }

    public static void reminder(double x, double y) {
        if (y == 0) {
            System.out.println("Can't divide by 0.");
        } else {
            System.out.println(x + " % " + y + " = " + (x % y));
        }
    }

    public static void equality(double x, double y) {
        System.out.println(x + " == " + y + " : " + (x == y));
    }

    public static void moreThan(double x, double y) {
        System.out.println(x + " > " + y + " ? " + (x > y));
    }

    public static void lessThan(double x, double y) {
        System.out.println(x + " < " + y + " ? " + (x < y));
    }

}

