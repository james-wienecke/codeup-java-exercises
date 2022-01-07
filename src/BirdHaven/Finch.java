package BirdHaven;

public class Finch extends Bird {

    public Finch(String name) {
        super(name);
    }

    public void makeNoise() {
        super.makeNoise();
        System.out.println("chirp chirp");
    }
}