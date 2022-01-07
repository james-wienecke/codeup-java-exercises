package BirdHaven;

public class BirdTest {
    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();
//
//        Duck mallard = new Duck();
//        mallard.setName("Mallard");
//        mallard.setCanFly(true);
//        mallard.makeNoise();
//        mallard.move();
//
//        Finch lesserGoldFinch = new Finch();
//        lesserGoldFinch.makeNoise();
//
//        Penguin mombo = new Penguin();
//        mombo.setName("Emperor Penguin");
//        mombo.makeNoise();

        Duck marvelDuck = new Duck("Marvel Duck", true, "Mediterranean region", 3678);

        System.out.println(marvelDuck.getName());

        System.out.println(marvelDuck.getHabitat());
        System.out.println(marvelDuck.getNumOfFeathers());
        marvelDuck.makeNoise();







    }
}