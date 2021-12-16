import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Loop Basics

        Do While

        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        Alter your loop to count backwards by 5's from 100 to -10.
        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

         2
         4
         16
         256
         65536
         */
        int i = 2;
        do {
            System.out.printf("%d\n", i);
            i = (int) Math.pow(i, 2);
        } while (i <= 1_000_000);
    }
}
