package Week_5.Q2;

public abstract class Q2Shape {

    protected double dim1;
    protected double dim2;

    public static final double PI = 3.14;

    public Q2Shape(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void PrintShape()
    {
        System.out.println("Inside Area for " + this.getClass().getSimpleName() + ".");
    }

    public abstract double area();
}
