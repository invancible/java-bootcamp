package com.invancible.section1;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int firstNum = (int) (num1 * 1000);
        int secondNum = (int) (num2 * 1000);

        return firstNum == secondNum;
    }
}
