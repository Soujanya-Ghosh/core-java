package inheritence2;

public class SavingsAccount {
    private float applyInterestRate;
    private double balance;
    public SavingsAccount(){}

    public SavingsAccount(float applyInterestRate, double balance) {
        this.applyInterestRate = applyInterestRate;
        this.balance = balance;
    }

    public float getApplyInterestRate() {
        return applyInterestRate;
    }

    public void setApplyInterestRate(float applyInterestRate) {
        this.applyInterestRate = applyInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public void applyInterestRate(){
        float interestRate = (float) (balance * applyInterestRate);

}
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "applyInterestRate=" + applyInterestRate +
                ", balance=" + balance +
                '}';
    }
}

