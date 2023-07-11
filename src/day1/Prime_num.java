package day1;
import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  prime = 0;
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                prime ++;
            }
            } if(prime > 2){
            System.out.println("It is not prime");
        }else if(num == 1){
            System.out.println("Prime number must be greater than 1");
        }else{
            System.out.println("It is  prime");
        }
        }
    }

