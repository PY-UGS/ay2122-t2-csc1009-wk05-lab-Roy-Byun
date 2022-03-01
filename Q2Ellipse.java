package Week_5.Q2;

public class Q2Ellipse extends Q2Shape {
    public Q2Ellipse(double dim1, double dim2)
    {
        super(dim1, dim2);
    }

    @Override
    public double area()
    {
        return PI * dim1 * dim2;
    }
}
