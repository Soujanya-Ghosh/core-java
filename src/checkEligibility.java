import java.util.Scanner;
public class checkEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        traditionalSwitch(age);
    }

    public static void traditionalSwitch(int age) {
        switch(age){
            case 1:
                if(age<18){
                    System.out.println("Not eligible for vote");
                }
                break;
            case 2:
                if(age >= 18){
                    System.out.println("Eligible for vote" );
                }
                break;
            default:
                System.out.println("Enter a valid input");
                break;
        }
    }
}
