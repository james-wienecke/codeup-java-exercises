package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
         sc = new Scanner(System.in);
    }

    String getString() {
        return sc.nextLine();
    }

    boolean yesNo() {
        String in = getString().trim();
        if (in.equalsIgnoreCase("yes") ||
                in.equalsIgnoreCase("y") ||
                in.equalsIgnoreCase("si") ||
                in.equalsIgnoreCase("1") ||
                in.equalsIgnoreCase("affirmative") ||
                in.equalsIgnoreCase("ok") ||
                in.equalsIgnoreCase("yup") ||
                in.equalsIgnoreCase("sure") ||
                in.equalsIgnoreCase("of course")) {
            return true;
        } else return false;
    }
}
