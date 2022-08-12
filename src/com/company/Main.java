package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());
        VipCustomer customer1 = new VipCustomer("Bob", "25000");
        System.out.println(customer1.getName());
        VipCustomer customer2 = new VipCustomer("Bob", "25000", "bob@mail.com");
        System.out.println(customer2.getName() + " " + customer2.getEmail());

        BankAccount bobsAccount = new BankAccount("12333", 0.00, "Bob Brown", "Bob@gmail.com", "12727844");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

//        simpleCalculator calculator = new simpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


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
