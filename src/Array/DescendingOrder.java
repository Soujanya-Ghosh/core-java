package Array;
import java.util.Arrays;
public class DescendingOrder {
    public static void main(String[] args) {
        int []array={6,7,3,9,5};
        int temp;
        int i;
        for( i=0;i<= array.length-1;i++){
            for(int j=i+1;j<= array.length-1;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }

                }
            }
            System.out.println(Arrays.toString(array));
        }

    }

