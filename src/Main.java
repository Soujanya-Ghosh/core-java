// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //traditionalSwitch(5);
       // traditionalSwitchString("x");
        traditionalSwitchOperators('*',25,0);
    }

    private static void traditionalSwitchOperators(char operator,int num1, int num2) {
       switch(operator){
           case '+':
               System.out.println(num1+num2);
               break;
           case '*':
               System.out.println(num1*num2);
               break;
           case '-':
               System.out.println(num1-num2);
               break;
           case '/':
               if(num2!=0) {
                   System.out.println(num1 / num2);
               }
               break;
           default:
               System.out.println("Invalid operator");
               break;
       }
    }

    private static void traditionalSwitchString(String inputString) {
        switch(inputString){
            case "a":
                System.out.println("It is a vowel");
                break;
            case "d":
                System.out.println("It is a consonant");
                break;
            case "i":
                System.out.println("It is a 2nd vowel");
                break;
            case "p":
                System.out.println("second consonant");
                break;
            default:
                System.out.println("a, e, i, o, and u");
        }
    }

    public static void traditionalSwitch(int input) {
        switch (input) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("value was 2, 3, or 4");
                break;
            case 5:
                System.out.println("Value was 5 , this is expected");
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
    }
}