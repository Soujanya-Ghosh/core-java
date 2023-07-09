package day1;
import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Table of: ");
        int num = sc.nextInt();
        System.out.println("Range of the table: ");
        int endTableAt = sc.nextInt();
        int i = 1;
        for(; i <= endTableAt; i++){
            int table = num * i;
            System.out.println(table);
        }
    }
}
