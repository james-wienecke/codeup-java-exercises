import java.util.Scanner;

public class HighLow {
        /* Game Development 101

    Welcome to the world of game development!

    You are going to build a high-low guessing game. Create a class named HighLow inside of src.

    The specs for the game are:

    Game picks a random number between 1 and 100.
    Prompts user to guess the number.
    All user inputs are validated.
    If user's guess is less than the number, it outputs "HIGHER".
    If user's guess is more than the number, it outputs "LOWER".
    If a user guesses the number, the game should declare "GOOD GUESS!"
    Hints

    Use the random method of the java.lang.Math class to generate a random number.
    Bonus

    Keep track of how many guesses a user makes.
    Set an upper limit on the number of guesses.
    */

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        hiLowGame game = new hiLowGame();
        do {
            game.getGuess(getByte((byte) 1, (byte) 100));
        } while (game.won);
    }

    private static byte getByte(byte min, byte max) {
        byte userByte = sc.nextByte();
        if (userByte < min || userByte > max)
            return getByte(min, max);
        else
            return  userByte;
    }
}
class hiLowGame {
    private final byte number;
    private short guessCount = 0;

    public boolean won = false;

    public hiLowGame() {
        number = (byte) ((Math.random() * 100) + 1);
        System.out.println( "---- Welcome to the Hi-Low Game! ----\n" +
                            "I've picked a number between 1 and 100. Try to guess it!");
    }

    public boolean getGuess(byte guess) {
        guessCount++;
        if (guess == number) {
            return win();
        } else if (guess < number) {
            guessFeedback(true);
        } else if (guess > number) {
            guessFeedback(false);
        } else {
            System.out.println("Uh oh, this shouldn't happen!");
        }
    }

    private boolean guessFeedback(boolean low) {
        if (low) {
            System.out.println("HIGHER");
        } else {
            System.out.println("LOWER");
        }
        System.out.printf("Current guesses: %d\n", guessCount);
        return false;
    }

    private boolean win() {
        System.out.println("GOOD GUESS!");
        return true;
    }
}