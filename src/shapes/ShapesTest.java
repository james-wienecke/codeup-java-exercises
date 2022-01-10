package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Measurable box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        Measurable box3 = box2;
        Square square1 = (Square) box3;
        square1.setLength(32);
        System.out.println(box3.getPerimeter());
        System.out.println(box3.getArea());
    }
}
