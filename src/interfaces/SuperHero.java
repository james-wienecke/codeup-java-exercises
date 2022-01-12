package interfaces;

public class SuperHero extends Person{
    @Override
    public void greeting() {
        System.out.println("Greetings citizen! Brush your teeth and drink your milk!");
    }

    public String alterEgo () {
        return "It's a secret. ;)";
    }
}