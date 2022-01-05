package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

        // no prompt test
        System.out.println("Enter something!");
        String myString = in.getString();
        System.out.println(myString);
        System.out.println("Yes or no?");
        boolean isYes = in.yesNo();
        System.out.println(isYes);
        System.out.println("Enter an integer");
        int myInt = in.getInt();
        System.out.println(myInt);
        System.out.println("Enter an integer between -55 and 123");
        int myIntBounded = in.getInt(-55, 123);
        System.out.println(myIntBounded);
        System.out.println("Enter a decimal number");
        double myDouble = in.getDouble();
        System.out.println(myDouble);
        System.out.println("Enter a decimal number between -2047.325 and 3345.0497");
        double myDoubleBounded = in.getDouble(-2047.325, 3345.0497);
        System.out.println(myDoubleBounded);

        // yes prompt test
        String myStringPrompt = in.getString("Enter something!");
        System.out.println(myStringPrompt);
        boolean isYesPrompt = in.yesNo("Yes or no?");
        System.out.println(isYesPrompt);
        int myIntPrompt = in.getInt("Enter an integer");
        System.out.println(myIntPrompt);
        int myIntBoundedPrompt = in.getInt(-55, 123, "Enter an integer between -55 and 123");
        System.out.println(myIntBoundedPrompt);
        double myDoublePrompt = in.getDouble("Enter a decimal number");
        System.out.println(myDoublePrompt);
        double myDoubleBoundedPrompt = in.getDouble(-2047.325, 3345.0497, "Enter a decimal number between -2047.325 and 3345.0497");
        System.out.println(myDoubleBoundedPrompt);

    }
}
