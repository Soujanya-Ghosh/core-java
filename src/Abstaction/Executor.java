package Abstaction;

public class Executor {
    public static void main(String[] args) {
        Circle firstShape = new Circle(5);
        System.out.println("Area is" +firstShape.calculateArea());
        System.out.println("Perimeter is" +firstShape.calculatePerimeter());
Rectangle secondShape=new Rectangle(2.8F,4.5F);
        System.out.println("Area is"+secondShape.calculateArea());
        System.out.println("Perimeter is"+secondShape.calculatePerimeter());
    }
}
