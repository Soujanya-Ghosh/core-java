package inheritence2;

public class CurrentAccount extends BankAccount{
    private double overDraftLimit;
    public CurrentAccount(){}
public void CurrentAccount(){}
    public CurrentAccount(int accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= balance + overDraftLimit){
            System.out.println("out of limit");
        }else{
            balance = balance - amount;
        }
       // super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
