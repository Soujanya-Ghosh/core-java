package Array;

public class AvgOfEle {
    public static void main(String[] args) {
        int []array={5,8,9,7,3};
        int sum=array[0];
        for(int i=1;i< array.length;i++){
            sum = sum + array[i];
        }
        float avg = (float) sum / array.length;
        System.out.println(avg);
    }
}
