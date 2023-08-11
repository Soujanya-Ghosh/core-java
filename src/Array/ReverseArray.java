package Array;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {6,3,8,2,9,1};
        int i=0;
        int j= array.length-1;
        while(i<j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
            System.out.println(Arrays.toString(array));

    }

}
