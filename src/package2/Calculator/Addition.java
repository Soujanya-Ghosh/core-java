package package2.Calculator;

public class Addition extends Calculation {

    public Addition(int num1, int num2) {
        super(num1, num2);
    }

    public void operation1() {
        int result1 = getNum1() + getNum2();
    }

    @Override
    public String toString() {
        return super.getNum1() + getNum2() + "Addition{}";
    }
}

