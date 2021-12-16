import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Loop Basics */
        // while
        int i = 5;
        while (i <= 15) {
            System.out.printf("%d ", i++);
        }


        // do while
        i = 2;
        do {
            System.out.printf("%d\n", i);
            i = (int) Math.pow(i, 2);
        } while (i <= 1_000_000);
    }
}
