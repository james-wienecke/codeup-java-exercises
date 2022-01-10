package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Measurable box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        Measurable box3 = new Square(9);
        // System.out.println(box3.getLength()); <== cannot do :(

        System.out.println(((Square) box3).getLength()); // <== can do :O
        // can also do this
        Square square1 = (Square) box3;
        square1.setLength(32);
        System.out.println(box3.getPerimeter());
        System.out.println(box3.getArea());
        // code smells bad though...

        // do NOT do this:
//        ((Square) box1).setLength(2);
//        System.out.println(((Square) box1).getLength());

        // ????
//        ((Shape) box1).setLength(2);
//        System.out.println(((Shape) box1).getLength());
    }
}
