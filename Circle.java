package Week_5;

public class Circle extends GeometricObject{

    private double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getArea()=" + getArea()
                + ", getPerimeter()=" + getPerimeter() + ", getDiameter()=" + getDiameter() + "]");
    }
}
