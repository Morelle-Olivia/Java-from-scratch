package com.company;

public class forStatements {

    public static void main(String[] args) {
        for (double interestRate = 8; interestRate >= 2; interestRate--) {
            System.out.println("Result = "+ String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Prime number is "+ i);
                if (count == 3) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
        System.out.println(count);

        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                sum += i;
                System.out.println("The number is " + i);
            }
            if (counter == 5) {
                System.out.println("Exiting loop");
                break;
            }
        }
        System.out.println(sum);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
