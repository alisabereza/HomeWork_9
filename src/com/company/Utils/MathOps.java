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

    public static class Execution implements Runnable {
        private double x, y;
        String s;

        public Execution(double x, double y, String s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }

        @Override
        public void run() {
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

}

