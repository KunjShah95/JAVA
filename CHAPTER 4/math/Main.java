package math;

public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Finding maximum using Math.max
        int maximum = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + maximum);

        // Finding minimum using Math.min
        int minimum = Math.min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + minimum);
        // Finding absolute value using Math.abs
        int num3 = -10;
        int absolute = Math.abs(num3);
        System.out.println("Absolute value of " + num3 + " is: " + absolute);
        // Finding square root using Math.sqrt
        double num4 = 25;
        double squareRoot = Math.sqrt(num4);
        System.out.println("Square root of " + num4 + " is: " + squareRoot);
        // Finding power using Math.pow
        double base = 2;
        double exponent = 3;
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + power);
        // Finding random number using Math.random
        double random = Math.random();
        System.out.println("Random number between 0 and 1 is: " + random);
        // finding ceil using Math.ceil
        double num5 = 10.45;
        double ceil = Math.ceil(num5);
        System.out.println("Ceil of " + num5 + " is: " + ceil);
        // finding floor using Math.floor
        double num6 = 10.45;
        double floor = Math.floor(num6);
        System.out.println("Floor of " + num6 + " is: " + floor);
        // finding round using Math.round
        double num7 = 10.45;
        long round = Math.round(num7);
        System.out.println("Round of " + num7 + " is: " + round);
        // finding cube root using Math.cbrt
        double num8 = 27;
        double cubeRoot = Math.cbrt(num8);
        System.out.println("Cube root of " + num8 + " is: " + cubeRoot);

    }
}
