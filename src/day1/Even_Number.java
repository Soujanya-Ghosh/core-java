package day1;
public class Even_Number {
    public static void main(String[] args) {
        System.out.println("Even numbers are: " );
        for( int number = 1; number <= 100 ; number++){
          if(number % 2 == 0){

              System.out.println(number);
          }
        }
    }
}
