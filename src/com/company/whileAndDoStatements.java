package com.company;

public class whileAndDoStatements {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number < finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            if (count == 5) {
                break;
            }
            System.out.println("Even number is: " + number);
        }
        System.out.println(count);

    }

    public static boolean isEvenNumber(int even) {
       if (even % 2 == 0){
           return true;
       } else {
           return false;
       }
    }
}
