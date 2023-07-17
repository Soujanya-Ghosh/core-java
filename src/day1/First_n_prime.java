package day1;
import java.util.Scanner;
public class First_n_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to prime number required ");
        int num = sc.nextInt();
        int count = 0;
        int prime = 2;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0) {
                    count++;
                }
            }
            if (count == 2) {

                System.out.println(prime);
            }
           prime++;

        }
    }
}
