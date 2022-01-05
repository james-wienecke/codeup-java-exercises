package shapes;
import util.Input;

public class CircleApp {
    private static Input in = new Input();
    public static void main(String[] args) {
        Circle circle = new Circle(in.getDouble("Enter a radius of a circle:"));
        System.out.println(printCircleDetails(circle));
    }

    private static String printCircleDetails(Circle c) {
        return String.format("Circumference: %f%nArea: %f",
                c.getCircumference(),
                c.getArea());
    }
}
