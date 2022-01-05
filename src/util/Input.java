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

    int getInt() {
        int input;
        try {
            input = sc.nextInt();
        } catch (Exception e) {
            input = getInt();
        }
        return input;
    }

    int getInt(int min, int max) {
        int userInt = getInt();
        if (min > max)
            return getInt(max, min);
        if (userInt < min || userInt > max)
            return getInt(min, max);
        else
            return  userInt;
    }

    double getDouble() {
        double input;
        try {
            input = sc.nextDouble();
        } catch (Exception e) {
            input = getDouble();
        }
        return input;
    }

    double getDouble(double min, double max) {
        double input = getDouble();
        if (min > max)
            return getDouble(max, min);
        if (input < min || input > max)
            return getDouble(min, max);
        else
            return  input;
    }
}
