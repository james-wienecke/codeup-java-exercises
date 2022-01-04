import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        /*
        *String Basics.

        Create a class named StringExercise with a main method.

        For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.


        We don't need no education
        We don't need no thought control
        */
        String strWall  = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(strWall);
        /*
        Check "this" out!, "s inside of "s!
        */
        String strQuotesInQuotes = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(strQuotesInQuotes);
        /*
        In windows, the main drive is usually C:\
        */
        String strMainDrive = "In windows, the main drive is usually C:\\";
        System.out.println(strMainDrive);
        /*
        I can do backslashes \, double backslashes \\,
        and the amazing triple backslash \\\!
        */
        String strEscapes = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(strEscapes);
    }
}
