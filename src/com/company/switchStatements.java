package com.company;

import java.util.Locale;

public class switchStatements {

    public static void main(String[] args) {
        int switchCase = 5;
        switch(switchCase) {
            case 1:
                System.out.println("Value 1");
                break;
            case 2: case 4: case 5:
                System.out.println("Value 2");
                break;
            default:
                System.out.println("Real value is neither 1 nor 2");
                break;
        }

        char switchChar = 'D';
        switch (switchChar) {
            case 'A':
                System.out.println("Letter A");
                break;
            case 'B':
                System.out.println("Letter B");
                break;
            case 'C':
                System.out.println("Letter C");
                break;
            case 'D':
                System.out.println("Letter D");
                break;
            case 'E':
                System.out.println("Letter E");
                break;
            default:
                System.out.println("Number not found here.");
        }

        String month = "FEBRAURY";
        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
                System.out.println("1st month.");
                break;
            case "febraury":
                System.out.println("2nd month");
                break;
        }

        printDayOfTheWeek(5);
        dayOfTheWeekChallenge(1);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("Tuesday, Wednesday, Thursday, Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void dayOfTheWeekChallenge(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("Tuesday, Wednesday, Thursday, Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else
        System.out.println("Invalid day");
    }
}
