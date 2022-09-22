package module8;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int[] oneArray = {1,2,3,4,5,6};
            reverse(oneArray);
        System.out.println(Arrays.toString(oneArray));
    }

    public static int[] reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return array;
    }
}
