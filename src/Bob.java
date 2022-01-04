import java.util.Scanner;

   /*
        Create a class named Bob with a main method for the following exercise.

        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
        Write the Java code necessary so that a user of your command line application can have a conversation with Bob. */

public class Bob {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bob: Hello, I'm Bob.");
        boolean continueChat = true;
        do {
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("bye")){
                System.out.println("Bob: OK later.");
                continueChat = false;
            } else if (userInput.charAt(userInput.length() - 1) == '?') {
                System.out.println("Bob: Sure.");
            } else if (userInput.charAt(userInput.length() - 1) == '!') {
                System.out.println("Bob: Whoa, chill out!");
            } else {
                System.out.println("Bob: Whatever.");
            }
        } while (continueChat);
    }
}
