package Array;

public class MinIndex {
    public static void main(String[] args) {
        int[]array={2,4,-1,0,5,7};
        int minIndex=0;
        int minValue=array[minIndex];
        for(int i=0;i< array.length;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        System.out.println(minIndex);
        System.out.println("value "+array[minIndex]);
    }
}
