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
        // setup a new hi-low game
        hiLowGame game = new hiLowGame();

        // allow user to set their difficulty
        setDifficulty(game);
        if (game.guessLimit > 0) {
            System.out.printf("Guess limit: %d\n", game.guessLimit);
        }
        // main game loop
        while (game.isOngoing()) {
            System.out.println("--------------------------------------");
            System.out.println("You guess:");
            game.userGuess(getByte((byte) 1, (byte) 100));
            }
        }

    private static byte getByte(byte min, byte max) {
        byte userByte = sc.nextByte();
        if (userByte < min || userByte > max) {
            System.out.printf("Invalid input: %d", userByte);
            return getByte(min, max);
        } else
            return userByte;
    }

    private static void setDifficulty(hiLowGame game) {
        System.out.println("Enter a number to limit the guesses you can make for this round. Max is 99");
        System.out.println("For unlimited chances, enter '0'.");
        game.guessLimit = getByte((byte) 0, (byte) 100);
    }
}

class hiLowGame {
    private final byte number;
    private byte guessCount = 0;
    public byte guessLimit;
    private boolean ongoing = true;

    public hiLowGame() {
        number = (byte) ((Math.random() * 100) + 1);
        System.out.println( "---- Welcome to the Hi-Low Game! ----\n" +
                            "I've picked a number between 1 and 100. Try to guess it!");
    }

    public void userGuess(byte guess) {
        // increment the guesses it's taken so far
        guessCount++;
        if (guess == number)
            win();
        else if ((guessCount >= guessLimit) && (guessLimit > 0)) {
            lose();
        } else guessFeedback(guess < number);
    }

    private void guessFeedback(boolean low) {
        if (low) {
            System.out.println("HIGHER");
        } else {
            System.out.println("LOWER");
        }
        System.out.printf("Current guesses: %d\n", guessCount);
        if (guessCount == guessLimit - 1)
            System.out.println("Next up is your last guess! Make it count!");
    }

    private void win() {
        System.out.println("GOOD GUESS!");
        System.out.printf("You guessed %d in %d guesses!", number, guessCount);
        ongoing = false;
    }

    private void lose() {
        System.out.println("Sorry, you've exceeded the allowed guesses for this difficulty. Try again!");
        System.out.printf("The number was %d, by the way...\n", number);
        ongoing = false;
    }

    public boolean isOngoing() {
        return ongoing;
    }
}