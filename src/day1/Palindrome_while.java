package day1;
import java.util.Scanner;
public class Palindrome_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int palindrome = 0;
        int num1 = num;
        while(num > 0){
             palindrome = palindrome * num1 % 10;
            num = num / 10;
        }
            if(num1 == palindrome){
                System.out.println("It is palindrome number");
            }else{
                System.out.println("It is not a palindrome number");
            }
        }
    }

