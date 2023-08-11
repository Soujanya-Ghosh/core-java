package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {2, 5, 10, 3, 11};
        int i;
        for ( i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }
            }
        }
//        int x=
//        System.out.println("Second largest number is"+x);
    }
}