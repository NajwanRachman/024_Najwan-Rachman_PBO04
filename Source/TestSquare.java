public class TestSquare {

    public static void main(String[] args) {

        Square s = new Square(5);

        System.out.println("Sebelum:");
        System.out.println("width = " + s.getWidth());
        System.out.println("length = " + s.getLength());

        s.setWidth(8);

        System.out.println("\nSesudah setWidth(8):");
        System.out.println("width = " + s.getWidth());
        System.out.println("length = " + s.getLength());
    }
}