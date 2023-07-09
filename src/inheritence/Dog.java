package inheritence;

public class Dog extends Animal{

        private String earShape;
        private String tailShape;

        public Dog() {
        }

        public Dog(String earShape, String tailShape) {
            this.earShape = earShape;
            this.tailShape = tailShape;
        }



        public String getEarShape() {
            return earShape;
        }

        public void setEarShape(String earShape) {
            this.earShape = earShape;
        }

        public String getTailShape() {
            return tailShape;
        }

        public void setTailShape(String tailShape) {
            this.tailShape = tailShape;
        }
public void bark(){
    System.out.println("This" + this.getType() + "barks");
}
public void run(){
    System.out.println("this" + this.getType() + "runs");
}
public void walk(){
    System.out.println("This" + this.getType()+ "walks");
}
public void wagTail(){
    System.out.println("This" + this.getType() + "wagtail");
}


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}';
    }
    }

