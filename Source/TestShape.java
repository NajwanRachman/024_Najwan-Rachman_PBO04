public class TestShape {

    public static void main(String[] args) {

        Shape s = new Shape("red", false);
        System.out.println(s);

        Circle c = new Circle(5.5, "blue", false);
        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());

        Rectangle r = new Rectangle(4.0, 5.0, "green", true);
        System.out.println(r);
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());

        Square sq = new Square(3.0, "yellow", true);
        System.out.println(sq);
        System.out.println("Area = " + sq.getArea());
        System.out.println("Perimeter = " + sq.getPerimeter());
    }
}