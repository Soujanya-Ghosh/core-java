package Abstaction;

 class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(){}

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public  double calculateArea(){
        return width * height;
    }
    @Override
    public  double calculatePerimeter(){
       return width+height;
    }
}
