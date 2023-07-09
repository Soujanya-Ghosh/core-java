package inheritence2;

public class SavingsAccount extends BankAccount {
    private float interestRate;
    public SavingsAccount(){}

    public SavingsAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    public void applyInterest(){
        System.out.println("interest");
    }
}
