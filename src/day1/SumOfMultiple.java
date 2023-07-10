package day1;

public class SumOfMultiple {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        for(int i = num; num <= 100; num ++){
            if(num % 3 == 0 || num % 5 == 0){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}
