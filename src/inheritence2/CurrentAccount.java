package inheritence2;

public class CurrentAccount extends BankAccount{
private double overDraftLimit;
public CurrentAccount(){}

    public CurrentAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
