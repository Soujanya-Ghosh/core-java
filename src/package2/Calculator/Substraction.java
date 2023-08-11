package package2.Calculator;

public class Substraction extends Calculation {

    public Substraction(int num1, int num2) {
        super(num1, num2);
    }
public void operation3(){
        int result3 = getNum1() - getNum2();
}
    @Override
    public String toString() {
        return "Substraction{}";
    }
}
