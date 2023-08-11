package Abstaction;

  class Circle extends Shape{
    private double radius;
    public Circle(){}

    public Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea( )
     {
         return Math.PI* radius * radius;
     }
     @Override
    public  double calculatePerimeter(){
        return Math.PI*radius;
     }
}
