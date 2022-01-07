package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return this.width * 4;
    }

    public double getArea() {
        return Math.pow(this.width, 2);
    }
}