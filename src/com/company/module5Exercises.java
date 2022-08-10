package com.company;

import java.util.Scanner;

public class module5Exercises {
    public static void main(String[] args) {
        printNumberInWord(25);
        isLeapYear(9000);
        getDaysInMonth(2, 2020);

        sumOdd(1, 11);

        String numberString = "2018";
        System.out.println("numberString = "+ numberString);
        double number = Double.parseDouble(numberString);
        System.out.println(number);

        numberString += 1;
        number += 1;
        System.out.println("numberString = "+ numberString);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = scanner.nextLine();
//        System.out.println("Your name: ");
//        name = scanner.nextLine();
        System.out.println("Your name is " + name);
//        name = scanner.nextLine();

        int num = 0;
        int count = 1;
//        while (num < 20) {
//            num++;
//            System.out.println("Enter number #"+ count + ":");
//            int number1 = scanner.nextInt();
//            count++;
//        }
//        scanner.close();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number2 = scanner.nextInt();

//                if (first){
//                    first = false;
//                    max = number2;
//                    min = number2;
//                }

                if (number2 > max) {
                    max = number2;
                }
                if (number2 < min){
                    min = number2;
                }
            } else {
                break;
//                System.out.println("Invalid number");
            }
        }

        System.out.println("Min = "+ min + ", max = "+ max);
        scanner.close();

//        while (true) {
//            int order = +1;
//            System.out.println("Enter number: ");
//            int number2 = scanner.nextInt();
//            if (number2 < 0) {
//                System.out.println("Invalid number");
//            }
//        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("False");
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("True");
            return true;
        }
        System.out.println("false+");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            return -1;
        } else if (month == 1) {
            System.out.println("31");
        } else if (month == 2 && isLeapYear(year) == true) {
            System.out.println("29");
            return 29;
        } else {
            System.out.println("28");
            return 28;
        }
//        if (month == 3) {
//            System.out.println("31");
//        }
        return -1;
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i) == true) {
                sum += i;
            } else {
                return -1;
            }
        }
//        System.out.println(sum);
        return sum;
    }
}
