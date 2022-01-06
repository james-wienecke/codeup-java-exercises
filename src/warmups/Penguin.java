package warmups;

public class Penguin {
    private String name;
    private String species;
    private double weight;
    private String sex;

    public Penguin(String name, String species, String sex, double weight) {
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean canFly() { return false; }
    public boolean areEvil() { return true; }
}
