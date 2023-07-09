package day1;
import java.util.Scanner;
public class Sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = num; num > 0;i++){
           sum = sum + num % 10;
           num = num / 10;
        }
        System.out.println(sum);
    }
}
