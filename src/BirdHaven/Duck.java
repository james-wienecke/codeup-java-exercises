package BirdHaven;

public class Duck extends Bird{
    protected String habitat;
    protected int numOfFeathers;
    public Duck(){}

    public Duck(String name){
        super(name);
    }


    public Duck(String name, boolean canFly) {
        super(name, canFly);

    }

    public Duck(String name, boolean canFly, String habitat, int numOfFeathers) {
        super(name, canFly);
        this.habitat = habitat;
        this.numOfFeathers = numOfFeathers;
    }

    // OVERRIDING
    public void makeNoise() {
        super.makeNoise();
        System.out.print("quack quack");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getNumOfFeathers() {
        return numOfFeathers;
    }

    public void setNumOfFeathers(int numOfFeathers) {
        this.numOfFeathers = numOfFeathers;
    }


    //     DO NOT DO THIS, THIS WILL CRASH YOUR PROGRAM (INFINITE LOOP)
    public void setName(String name) {
        super.setName(name);
    }
}