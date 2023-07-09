import java.util.Scanner;
public class weekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();
        traditionalSwitch(dayNum);
    }

    public static void traditionalSwitch(int dayNum) {
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter valid input");
                break;

        }
    }
}
