package com.company;

public class module4Excercises {

    public static void main(String[] args) {
        checkNumber(-1);
    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }
        else if (number == 0) {
            System.out.println("Zero");
        }
    }
}
