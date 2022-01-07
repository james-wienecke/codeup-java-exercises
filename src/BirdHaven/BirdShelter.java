package BirdHaven;

public class BirdShelter {
    public void shelterSounds(Bird[] birdsOfTheShelter) {
        for (Bird birdie : birdsOfTheShelter) {
            birdie.makeNoise();
        }
    }
}