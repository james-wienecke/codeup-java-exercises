import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        /*
        *String Basics.

        Create a class named StringExercise with a main method.

        For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.


        We don't need no education
        We don't need no thought control
        */
        String strWall  = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(strWall);
        /*
        Check "this" out!, "s inside of "s!
        */
        String strQuotesInQuotes = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(strQuotesInQuotes);
        /*
        In windows, the main drive is usually C:\
        */
        String strMainDrive = "In windows, the main drive is usually C:\\";
        System.out.println(strMainDrive);
        /*
        I can do backslashes \, double backslashes \\,
        and the amazing triple backslash \\\!
        */
        String strEscapes = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(strEscapes);
    }
}

class Bob {
           /*
        Create a class named Bob with a main method for the following exercise.

        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
        Write the Java code necessary so that a user of your command line application can have a conversation with Bob. */

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
