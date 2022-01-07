package BirdHaven;

public class Bird {
    // can it fly?
    private boolean canFly;

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    // what kind of bird is it?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(this.getName() + " goes ");
    }

    public void move() {
        System.out.println("Flap flap");
    }

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public Bird(String name, boolean canFly) {
        this.name = name;
        this.canFly = canFly;
    }
}