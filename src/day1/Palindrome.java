package day1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int num1 = num;
        int palindrome = 0;
        for( int i = num; num > 0; i++){
          palindrome =  palindrome + num % 10;
          num = num/10;
          if(palindrome == num1){
              System.out.println("It is a palindrome number");
          }
          else{
              System.out.println("It is not a palindrome number");
          }
        }
    }
}
