package Array;

public class SumOfArrayEle {
    public static void main(String[] args) {
        int [] array={7,9,5,8};
        int sum= array[0];
        for(int i=1;i< array.length;i++){
            sum=sum+ array[i];
        }
        System.out.println(sum);
    }
}
