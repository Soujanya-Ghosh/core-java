package package2.Calculator;

public class Multiplication extends Calculation{

    public Multiplication(int num1, int num2) {
        super(num1, num2);
    }
    public void operation2(){
        int result2 = getNum2() * getNum1();
    }

    @Override
    public String toString() {
        return super.getNum1()+getNum2()+"Multiplication{}";
    }
}
