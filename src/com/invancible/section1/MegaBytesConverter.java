package com.invancible.section1;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int MB = 1024;

        int megaBytes = kiloBytes / MB;
        int remainingKiloBytes = kiloBytes % MB;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }

    }
}
