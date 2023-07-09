package day1;
import java.util.Scanner;
public class Factorial_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        if(num == 0){
            System.out.println("Invalid");
        }
        else{
            System.out.println(num *fact*(num - 1));
        }
    }
}
