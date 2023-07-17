package day1;

import java.util.Scanner;

public class Prime_palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int palindrome = num;
        int var = 0;
        int count = 0;
        for(int i = num; num > 0;) {
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;

                }
            }
            var = var * 10 + num % 10;
            num = num / 10;
        }
      //  if( count == 3 * 2 && var == palindrome ){
            System.out.println("It is a prime palindrome");
        }else{
            System.out.println("It is not a prime palindrome");
        }
    }
}
