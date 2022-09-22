package module8;

import java.util.Scanner;

public class module8exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min: " + returnedMin);
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int readInt = scanner.nextInt();
            scanner.nextLine();
            array[i] = readInt;
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
