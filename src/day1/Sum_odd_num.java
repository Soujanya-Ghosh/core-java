package day1;

public class Sum_odd_num {
    public static void main(String[] args) {
        int num = 1;

        int sum = 0;
       do{
           if(num % 2 != 0){
               sum = sum + num;
           }
           num ++;

       }
       while(num <= 50);
        System.out.println(sum);
    }
    }

