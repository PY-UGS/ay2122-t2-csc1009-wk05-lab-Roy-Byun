package Week_5.Q2;

public class Q2Square extends Q2Shape {

    public Q2Square(double dim1, double dim2)
    {
        super(dim1, dim2);
    }

    @Override
    public double area()
    {
        return dim1 * dim2;
    }
}
