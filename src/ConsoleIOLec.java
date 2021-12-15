import java.util.Scanner;

public class ConsoleIOLec {
    public static void main (String[] args) {
        String firstName = "James";
        String lastName = "Wienecke";
        int favNum = 26;
        double pi = 3.141592653;

        System.out.printf("Hello, my name is %s %s. My favorite number is %n", firstName, lastName);
        System.out.printf("\nMy favorite number is %d! Pi to 6 decimal precision is %.6f...", favNum, pi);
        System.out.printf("\nPi to 2 digits of decimal precision is %.2f", pi);
        System.out.print("\nFormatting strings is cool, huh?");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter your favorite color:");
//        String userInput = scanner.next();
//        System.out.printf("\nYou entered %s", userInput);

        System.out.println("\nGimme a sentence:");
        String userNum = scanner.nextLine();
        System.out.printf("You entered %s", userNum);
    }
}
