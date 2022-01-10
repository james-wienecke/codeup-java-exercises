package abstraction;

public class Car extends Vehicle{
    public byte wheels = 4;

    public void go() {
        System.out.println("Vroom vroom! Beep beep! I'm a car.");
    }
}