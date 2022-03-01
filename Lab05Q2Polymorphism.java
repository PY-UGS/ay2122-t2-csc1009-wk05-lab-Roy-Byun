package Week_5.Q2;

public class Lab05Q2Polymorphism {

    public static void main(String[] args)
    {
        Q2Rectangle rectangle = new Q2Rectangle(9, 5);
        Q2Triangle triangle = new Q2Triangle(10, 8);
        Q2Circle circle = new Q2Circle(5, 5);
        Q2Ellipse ellipse = new Q2Ellipse(7, 7);
        Q2Square square = new Q2Square(6, 6);

        Q2Shape figref;
        figref = rectangle;
        figref.PrintShape();
        System.out.println("Area is " + figref.area());

        figref = triangle;
        figref.PrintShape();
        System.out.println("Area is " + figref.area());

        figref = circle;
        figref.PrintShape();
        System.out.println("Area is " + figref.area());

        figref = ellipse;
        figref.PrintShape();
        System.out.println("Area is " + figref.area());

        figref = square;
        figref.PrintShape();
        System.out.println("Area is " + figref.area());
    }
}
