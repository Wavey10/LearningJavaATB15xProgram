package OOPS_concepts_challenge;

public class Challenge_8
{
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5,3);
        System.out.println("Rectangle Area: "+rectangle.getArea());
        Shape circle = new Circle(4);
        System.out.println("Circle Area: "+circle.getArea());
    }

}

abstract class Shape
{
    abstract public double getArea();
}

class Rectangle extends Shape
{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }
}

class Circle extends Shape
{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * (radius * radius);
    }
}