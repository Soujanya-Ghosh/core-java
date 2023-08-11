package inheritence2;

public class BankAccount {
    private int accountNumber;
     double balance;
    public BankAccount(){}

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBankBalance() {
        return balance;
    }

    public void setBankBalance(double bankBalance) {
        this.balance = bankBalance;
    }

    public void deposit(double amount){

        balance += amount;
    }
    public void withdraw( double amount){
        if(amount <= balance ){
            balance -= amount;
        }else{
            System.out.println("Balance insufficient");
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

}
