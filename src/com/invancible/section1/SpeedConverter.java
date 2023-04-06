package com.invancible.section1;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        double MILE = 1.609;

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / MILE);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
