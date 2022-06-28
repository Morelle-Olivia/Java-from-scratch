package com.company;

public class methodOverloading {

    public static final String INVALID_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println("Invalid feet or inches");
        double centimeters = calcFeetAndInchesToCentimeters(6,13);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(157);
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) && inches < 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches, " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches/12;
        double remainder = (int) inches%12;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainder);
        return calcFeetAndInchesToCentimeters(feet, inches);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) && ((seconds < 0) && (seconds > 59))) {
            return INVALID_MESSAGE;
        }
        int hours = minutes / 60;
        int remMinutes = seconds % 60;
        return hours + "h " + remMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if ((seconds < 0) && (seconds > 59)) {
            return INVALID_MESSAGE;
        }
        int minutes = seconds / 60;
        int remSeconds = seconds % 60;
        return getDurationString(minutes, remSeconds);
    }
}
