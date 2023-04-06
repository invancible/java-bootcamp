package com.invancible.section1;

public class TeenNumberChecker {

    public static boolean hasTeen(int param1, int param2, int param3) {

        return (param1 >= 13 && param1 <= 19) ||
                (param2 >= 13 && param2 <= 19) ||
                (param3 >= 13 && param3 <= 19);
    }

    public static boolean isTeen(int age) {

        return (age >= 13 && age <= 19);
    }
}
