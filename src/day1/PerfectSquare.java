package day1;
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);

        if(sqrt* sqrt == num){
            System.out.println("It is a perfect square");
        }else {
            System.out.println("It is not a perfect square");
        }
    }
}
