package inheritence2;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double balance;
    public SavingsAccount(){}

    public SavingsAccount(double interestRate, double balance) {
        this.interestRate = interestRate;
        this.balance = balance;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void applyInterest(){
        double interest =  (balance * (interestRate)/100);

}
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "applyInterestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
}

