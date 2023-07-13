package day1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int gcd = 1;
        while(a >= i && b >= i){
            if(a % i == 0 && b % i == 0){
                gcd = gcd * i;
                a = a / i;
                b = b / i;
            }
            i++;

        }
        System.out.println(gcd);
    }
}
