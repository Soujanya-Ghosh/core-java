package Array;
import java.util.Arrays;
public class AscendingOrder {
    public static void main(String[] args) {
        int []array={5,2,0,90,1,-1};
        int temp;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++) {
                if (array[i] > array[j]) {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }


    }
}
