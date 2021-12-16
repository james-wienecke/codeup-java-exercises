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
        System.out.print("\n");

        // do while refactored to for
        for (int i = 2; i <= 1_000_000; i = (int) Math.pow(i, 2)) {
            System.out.printf("%d\n", i);
        }
    }
}
