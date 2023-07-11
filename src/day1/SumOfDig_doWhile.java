package day1;
public class SumOfDig_doWhile {
    public static void main(String[] args) {
        int num = 4456;
        int sum = 0;
        do{
            sum = sum + num % 10;
            num = num / 10;
        }while(num > 0);{
            System.out.println(sum);
        }
    }
}
