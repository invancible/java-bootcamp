package com.invancible.section1;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int hours = (int) minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.print(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
