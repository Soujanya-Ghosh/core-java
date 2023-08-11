package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] integerArray = {50, 60, -10, 56, -1};
        int minValue = 0;

        for ( int i = 0; i < integerArray.length - 1; i++) {
            if (integerArray[i] < integerArray[minValue]) {
                minValue=i;

            }


        }
        System.out.println(minValue);
    }

}
