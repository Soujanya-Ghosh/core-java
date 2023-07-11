package day1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int palindrome = 0;
        for (int i = num; num > 0; ) {
            i = i * 10 + num % 10;
            num = num / 10;
        }
        if (num == palindrome) {
            System.out.println("It is palindrome");

        } else {
            System.out.println("Not a palindrome");
        }
    }
}
