package Array;

public class MaxEle {
    public static void main(String[] args) {


        int [] array={5,8,-1,-6,90,6};
        int maxEle = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>maxEle){
                maxEle=array[i];
            }
        }
        System.out.println(maxEle);
    }
}
