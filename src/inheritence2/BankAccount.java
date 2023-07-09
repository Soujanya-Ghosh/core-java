package inheritence2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(){}

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBankBalance() {
        return balance;
    }

    public void setBankBalance(double bankBalance) {
        this.balance = bankBalance;
    }
    public void deposit(){
        System.out.println( "Deposit in the account");
    }
    public void withdraw(){
        System.out.println("Withdraw from the account");
    }
    public void getBalance(){
        System.out.println("Get balance of the account");
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

}
