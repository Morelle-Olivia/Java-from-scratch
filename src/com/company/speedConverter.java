package com.company;

public class speedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int MegaByte = kiloBytes / 1024;
            int Remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MegaByte + " MB and " + Remainder + " KB" );
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ( hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else if (barking && hourOfDay < 8 || hourOfDay > 22){
            return true;
        }else{
            return false;
        }
    };
}
