package inheritence2;
import java.io.FilterOutputStream;
import java.util.Scanner;
public class Executor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount firstSavingsAccount = new SavingsAccount(0167234567,00,40000);
        System.out.println("Deposit money is : ");
        double deposit = sc.nextDouble();
        firstSavingsAccount.deposit(deposit);
       // System.out.println(firstSavingsAccount.getBalance());
        System.out.println("Interest rate : ");
        double interestRate = sc.nextDouble();
        firstSavingsAccount.setInterestRate(interestRate);
        System.out.println(firstSavingsAccount.getInterestRate());
        firstSavingsAccount.withdraw(500);
        System.out.println(firstSavingsAccount.getBalance());
        System.out.println(firstSavingsAccount.toString());
        CurrentAccount firstCurrentAccount = new CurrentAccount(0167234567,40000,0);
        System.out.println("OverDraftLimit is : ");
        double overDraftLimit = sc.nextDouble();
        firstCurrentAccount.setOverDraftLimit(overDraftLimit);
        System.out.println(firstCurrentAccount.getBankBalance());
        firstCurrentAccount.withdraw(1000);
        System.out.println(firstSavingsAccount.getBalance());
        System.out.println(firstCurrentAccount.toString());
    }
}
