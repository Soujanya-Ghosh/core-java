import java.util.Scanner;
public class gradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        traditionalSwitch(number);
    }

    public static void traditionalSwitch(int number){
      switch(number){
          case 1:
          if(number >= 90){
              System.out.println("Grade A+");
          }
          break;
          case 2:
              if(number >= 70 && number < 90){
                  System.out.println("Grade A");

              }
              break;
          case 3:
              if (number >= 60 && number < 70){
                  System.out.println("Grade B");
              }
              break;
          case 4:
              if (number >=50 && number < 60){
                  System.out.println("Grade C");
              }
              break;
          case 5:
              if (number >= 40 && number <50){
                  System.out.println("Grade D");
              }
              break;
          default:
              System.out.println("Below 40 fail");
      }

    }
}
