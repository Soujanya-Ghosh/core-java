package day1;

public class Palindrome_while {
    public static void main(String[] args) {
        int num = 121;
        int palindrome = 0;
        while(num > 0){
             palindrome = palindrome * num % 10;
            num = num / 10;}
            if(num == palindrome){
                System.out.println("It is palindrome number");
            }else{
                System.out.println("It is not a palindrome number");
            }
        }
    }

