package BirdHaven;

public class Penguin extends Bird {

    public Penguin(String name){
        super(name);
    }

    public void makeNoise() {
        System.out.println(this.getName() + " goes honk honk.");
    }

    public void move() {
        System.out.println(this.getName() + "goes waddle waddle.");
    }
}