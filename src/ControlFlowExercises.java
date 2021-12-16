import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
    }
}
