package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int value = 10;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Integer min Value = " + minValue);
        System.out.println("Integer max value = " + maxValue);
        System.out.println("Busted Max value = " + (maxValue + 1));
        System.out.println("Busted Min value = " + (minValue + 1));

        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 10000;
        long longVar = 50000 + (10 * (byteVar + shortVar + intVar));
        System.out.println(longVar);

        float myfloat = 5.25f / 2f;
        double myd = 5.25d;
        System.out.println(myfloat);

        String myString = "This is a string";
        System.out.println("myString is " + myString);
        myString = myString + " more string";
        System.out.println("myString is " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is " + myString);

        String numberString = "250.55";
        numberString = numberString + " 250.55";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Is not an Alien");
            System.out.println("And I'm not scared!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got a high score");
        }
        int secondScore = 81;
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("You got the second highest score.");
        }

        if ((topScore > 90) || (secondScore >= 90)) {
            System.out.println("Either is true");
        }

        double firstDouble = 20.00;
        double secDouble = 80.00;
        double sum = (firstDouble + secDouble) * 100;
        System.out.println(sum);
        double remainder = sum % 40.00;
        System.out.println(remainder);
        boolean ifvar = (remainder == 0) ? true : false;
        System.out.println(ifvar);

        if (!ifvar) {
            System.out.println("Got some remainder.");
        }

        int scoreOne = calculateHighScorePosition(1500);
        displayHighScorePosition("Boy", scoreOne);
        scoreOne = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", scoreOne);
        scoreOne = calculateHighScorePosition(400);
        displayHighScorePosition("Toy", scoreOne);
        scoreOne = calculateHighScorePosition(50);
        displayHighScorePosition("Yam", scoreOne);
        scoreOne = calculateHighScorePosition(1000);
        displayHighScorePosition("John", scoreOne);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;
    }


}
