import java.util.Scanner;

public class StringsLec {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char d = 'd';
        // char comparisons can be done with equality operator
        System.out.println(d == 'd');
        String stringDemo = "I am a string and require double quotes. Single quotes are for chars!";

        String favoriteSoda = "Vanilla Coke Zero";
        System.out.println("Hey James, what is your favorite soda?");
        String userSoda = sc.nextLine();

        // strings (because they are reference types and non-primitive, need to use methods to compare
        // can use String.equals(*other string*) or String.equalsIgnoreCase(*other string*) to ignore capitalization
        System.out.printf("James remembered his favorite soda, and typed its name properly! %b\n", favoriteSoda.equalsIgnoreCase(userSoda));

        // compare the start and end of a string

        String david = "David";
        String dad = "Dad";

        char firstLetterOfDavid = david.charAt(0);
        System.out.printf("Does \"David\" and \"Dad\" start with the same letter?\n", dad.startsWith("" + firstLetterOfDavid));

        // changing casing in strings

        String scream = "AAAAAHHHHH!!!!!";
        System.out.println(scream.toLowerCase());
    }
}
