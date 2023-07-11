package day1;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int num = sc.nextInt();
        int sum = 0;
        for( int i = num; num > 0; i++) {
            int dig = num % 10;
            sum = sum + (dig * dig * dig);
            num = num / 10;
        }
            if(sum == num){
                System.out.println("It is  a armstrong number");
            }else{
                System.out.println("It is not a armstrong number");//wrong output

        }

    }
}
