import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        /*
        Copy this code into your main method:
        double pi = 3.14159;
        Write some Java code that uses the variable pi to output the following:

        The value of pi is approximately 3.14.
        Don't change the value of the variable; instead, reference one of the links above
        and use System.out.format to accomplish this.
        */
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);

        /* Explore the Scanner Class.
        Prompt a user to enter an integer and store that value in an int variable using the nextInt method. */
//        System.out.println("\nPlease enter an integer:");
        Scanner scanner = new Scanner(System.in);
//        int userInt = scanner.nextInt();
//        System.out.printf("You entered: %d", userInt);

        /* What happens if you input something that is not an integer? */
        // Exception in thread "main" java.util.InputMismatchException
        /* Prompt a user to enter 3 words, and store each of them in a separate variable.
        Then, display them back in the console, each on a newline. */
//        System.out.println("\nPlease enter three words:");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("\n%s\n%s\n%s", word1, word2, word3);

        // clear the newline outta here
//        scanner.nextLine();

        // What happens if you enter less than 3 words?
        // keeps prompting for more input, does not exit

        // What happens if you enter more than 3 words?
        // ignores input further than the 3 words it took in

        /* Prompt a user to enter a sentence, then store that sentence in a String variable
        using the next method. Then, display that sentence back to the user. */
//        System.out.println("\nPlease enter a sentence:");

//        String sentence = scanner.next();
        // next only takes in the first word/token

//        String sentence = scanner.nextLine();
//
//        System.out.printf("You entered \"%s\"", sentence);

        // do you capture all the words?
        // Rewrite the above example using the nextLine method.


        /*
        Calculate the perimeter and area of Codeup's classrooms.
        Prompt the user to enter values of length and width of a classroom
        at Codeup (or your room if virtual).
         */
        System.out.println("\nPlease enter the width of the room (in meters).");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the length of the room (in meters).");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("\nPlease enter the height of the room (in meters)");
        double height = Double.parseDouble(scanner.nextLine());

        /* Use the nextLine method each time you need to get user input.
        In this case, we need it twice, once to get the user input for the length and again to get the
        user input for the width. Parse the resulting strings to a numeric type.


        Assume that the rooms are perfect rectangles.
        Assume that the user will enter valid numeric data for length and width.
        Display the area and perimeter of that classroom.


         The area of a rectangle is equal to the length times the width, and the perimeter
        of a rectangle is equal to 2 times the length plus 2 times the width.
         */

        /* *Bonuses* */
        /* In your perimeter/area calculator:
        - Accept decimal entries.
        - Calculate the volume of the rooms in addition to the area and perimeter.
         */

        System.out.printf("\nThe perimeter of the room is %fm.", (width * 2 + length * 2));
        System.out.printf("\nThe area of the room is %fm^2.", (width * length));


        System.out.printf("\nThe volume of the room is %fm^3.", (width * length * height));

        /*
        The Scanner class can be told specifically what characters or pattern
        separates tokens in a piece of input with the useDelimiter method. Add the following line of code to
        your application after you have created a scanner
        (assuming the variable holding the Scanner is named scanner):

        scanner.useDelimiter("\n");
        */

        // How does this change the way your program operates?

        /* Rewrite your classroom program to use nextInt method.
        If you added the line of code above to your application, you should now have no
        trouble handling multiple pieces of user input.
         */

    }
}
