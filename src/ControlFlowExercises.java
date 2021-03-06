import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("\n");
        /* Loop Basics */
        // while refactored to for
        for (short i = 5; i <= 15; i++) {
            System.out.printf("%d ", i++);
        }

        System.out.println();

        for (short i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

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
        for (short i = 1; i <= 100; i++) {
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

        do {
            System.out.println("Please gimme ONE integer! I need to build a table of powers");
            long userNum = sc.nextInt();
            System.out.printf("Ok here is a table for %d\n", userNum);
            System.out.println(" number |    squared |        cubed\n------- | ---------- | ------------");
            for (long i = 1; i <= userNum; i++) {
                System.out.format("%7d | %10d | %12d\n", i, (long) Math.pow(i, 2), (long) Math.pow(i, 3));
            }
            sc.nextLine();
            System.out.println("Do you want to see another table? (y/n)");
            if (sc.nextLine().equals("n")) {
                break;
            }
        } while (true);
        System.out.println("Thank you! Bye!");
        /* Letter Grades */
        //Convert given number grades into letter grades.
        //
        // * Prompt the user for a numerical grade from 0 to 100.
        // * Display the corresponding letter grade.
        // * Prompt the user to continue.
        // * Assume that the user will enter valid integers for the grades.
        // * The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0
        //Bonus
        //Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        do {
            System.out.println("Please enter a numerical grade:");
            short userGrade = sc.nextShort();
            String letterGrade = "A+";
            if (userGrade < 60) letterGrade = "F";
            else if (userGrade < 62) letterGrade = "D-";
            else if (userGrade < 64) letterGrade = "D";
            else if (userGrade < 66) letterGrade = "D+";
            else if (userGrade < 72) letterGrade = "C-";
            else if (userGrade < 76) letterGrade = "C";
            else if (userGrade < 80) letterGrade = "C+";
            else if (userGrade < 82) letterGrade = "B-";
            else if (userGrade < 85) letterGrade = "B";
            else if (userGrade < 88) letterGrade = "B+";
            else if (userGrade < 92) letterGrade = "A-";
            else if (userGrade < 96) letterGrade = "A";

            System.out.printf("%d is a %s grade.", userGrade, letterGrade);
            sc.nextLine();
            System.out.println("\nDo you wish to continue? (y/n)");
            if (sc.nextLine().equals("n"))
                break;
        } while (true);
        System.out.println("Thank you! Have a great day!");
    }
}
