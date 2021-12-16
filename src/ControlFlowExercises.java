import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("\n");
        /* Loop Basics */
        // while refactored to for
        for (int i = 5; i <= 15; i++) {
            System.out.printf("%d ", i++);
        }

        // newline for the power loop
        System.out.print('\n');

        // do while refactored to for
        for (int i = 2; i <= 1_000_000; i = (int) Math.pow(i, 2)) {
            System.out.printf("%d\n", i);
        }

        /* FizzBuzz */
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test.
        // Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        /* Table of Powers */
        //Display a table of powers.
        // * Prompt the user to enter an integer.
        // * Display a table of squares and cubes from 1 to the value entered.
        // * Ask if the user wants to continue.
        // * Assume that the user will enter valid data.
        // * Only continue if the user agrees to.

        //Example Output
        /*
            What number would you like to go up to? 5

            Here is your table!

            number | squared | cubed
            ------ | ------- | -----
            1      | 1       | 1
            2      | 4       | 8
            3      | 9       | 27
            4      | 16      | 64
            5      | 25      | 125
         */

        System.out.println("Please gimme ONE integer please i need to build taable of poweeers");
        int userNum = sc.nextInt();
        System.out.printf("Ok here table for %d\n", userNum);
        System.out.println("number | squared | cubed\n------ | ------- | -----");
        for (int i = 1; i <= userNum; i++) {
            System.out.format("%6d | %7d | %5d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
        System.out.println("thankyou byeeeee");
    }
}
