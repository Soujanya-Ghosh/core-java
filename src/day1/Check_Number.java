package day1;
import java.util.Scanner;
public class Check_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
        {
            System.out.println("The number is zero");
        }
        else if(number < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("It is a positive number");
        }
    }
}
