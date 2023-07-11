package inheritence2;

public class SavingsAccount {
    private double applyInterestRate;
    private double balance;
    public SavingsAccount(){}

    public SavingsAccount(double applyInterestRate, double balance) {
        this.applyInterestRate = applyInterestRate;
        this.balance = balance;
    }

    public double getApplyInterestRate() {
        return applyInterestRate;
    }

    public void setApplyInterestRate(double applyInterestRate) {
        this.applyInterestRate = applyInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public void applyInterestRate(){
        double interestRate =  (balance * (applyInterestRate)/100);

}
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "applyInterestRate=" + applyInterestRate +
                ", balance=" + balance +
                '}';
    }
}

