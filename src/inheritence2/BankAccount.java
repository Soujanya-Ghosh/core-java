package inheritence2;

public class BankAccount {
    private String accountNumber;
     double balance;
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
