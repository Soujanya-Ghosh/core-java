package Abstaction;

abstract class Shape {
    private int radius;
    private String name;
    public Shape(){}

    public Shape(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}

