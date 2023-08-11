package package2.Calculator;

public class Division extends Calculation{

    public Division(int num1, int num2) {
        super(num1, num2);
    }
public void operation4(){
        int result4 = getNum1() / getNum2();
}
    @Override
    public String toString() {
        return "Division{}";
    }
}
