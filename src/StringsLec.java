import java.util.Scanner;

public class StringsLec {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char d = 'd';
        String stringDemo = "I am a string and require double quotes. Single quotes are for chars!";

        String favoriteSoda = "Vanilla Coke Zero";
        System.out.println("Hey James, what is your favorite soda?");
        String userSoda = sc.nextLine();
        System.out.printf("James remembered his favorite soda, and typed its name properly! %b", favoriteSoda.equalsIgnoreCase(userSoda));
    }
}
