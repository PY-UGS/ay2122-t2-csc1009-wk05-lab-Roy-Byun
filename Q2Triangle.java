package Week_5.Q2;

public class Q2Triangle extends Q2Shape {
    public Q2Triangle(double dim1, double dim2)
    {
        super(dim1, dim2);
    }

    @Override
    public double area()
    {
        return dim1 * dim2;
    }
}
