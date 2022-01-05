package shapes;
import util.Input;

public class CircleApp {
    private static Input in = new Input();
    private static int totalCircles = 0;

    public static void main(String[] args) {
        do {
            createCircle();
        } while(in.yesNo("Would you like to create another circle?"));
        System.out.println(String.format("Circles created: %d", getTotalCircles()));
    }

    private static void createCircle() {
        Circle circle = new Circle(in.getDouble("Enter a radius of a circle:"));
        incrementTotalCircles();
        System.out.println(printCircleDetails(circle));
    }

    private static String printCircleDetails(Circle c) {
        return String.format("Circumference: %f%nArea: %f",
                c.getCircumference(),
                c.getArea());
    }

    public static int getTotalCircles() {
        return totalCircles;
    }

    public static void incrementTotalCircles() {
        totalCircles++;
    }
}
