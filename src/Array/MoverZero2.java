package Array;

public class MoverZero2 {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 5, 0, 4, 0};
        moveAllZeros(array);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
        static int temp;

         static void moveAllZeros(int[] array){
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0 && array[j] == 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                if (array[j] != 0) {
                    j++;
                }

            }
        }
    }

