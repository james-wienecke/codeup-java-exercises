import java.util.Scanner;

public class Warmups {
    public static void main (String[] args) {
        String javaType = "Java is statically typed, ";
        String javaScriptType = "while JavaScript is dynamically typed!";
        System.out.println(javaType + javaScriptType);

        System.out.println("What did you have for breakfast today?");
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        String userBreakfast = in.next();
        System.out.printf("You answered: \"%s\".\n", userBreakfast);
        if(userBreakfast.equals("nothing")) {
            System.out.println("What? You ate nothing??? That's no good...");
        } else if(userBreakfast.equals("coffee")) {
            System.out.println("I hope you had more for breakfast than just that...");
        } else {
            System.out.println("Well, I hope you enjoyed it...");
        }

    }
}
