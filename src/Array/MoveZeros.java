package Array;

public class MoveZeros {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 5, 0, 4};
        int temp;
        int j;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) ;
            for ( j = i + 1; j < array.length; j++) {
                if (array[j] != 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }


            }
            System.out.println(array[j]);
        }
    }
}
