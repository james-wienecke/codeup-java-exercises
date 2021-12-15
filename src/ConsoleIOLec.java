public class ConsoleIOLec {
    public static void main (String[] args) {
        String firstName = "James";
        String lastName = "Wienecke";
        int favNum = 26;
        double pi = 3.141592653;

        System.out.printf("Hello, my name is %s %s. My favorite number is %n", firstName, lastName);
        System.out.printf("My favorite number is %d! Pi to 6 decimal precision is %.6f...", favNum, pi);
        System.out.printf("Pi to 2 digits of decimal precision is %.2f", pi);
    }
}
