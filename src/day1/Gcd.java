package day1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        int i = 1;
        int j = 1;
        while(i <= a){
            while(j <= b){
                if(b % j == 0){
                    gcd = gcd * j;
                    b = b / j;
                }
               j++;
            }
            System.out.println(gcd);
        }

    }
}
