package Array;

public class MinEle {
    public static void main(String[] args) {
        int []array={5,8,-1,-6,90,6};
        int minValue=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]<minValue){
                minValue=array[i];
            }
        }
        System.out.println(minValue);
    }
}
