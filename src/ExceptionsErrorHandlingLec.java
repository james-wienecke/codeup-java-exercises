public class ExceptionsErrorHandlingLec {
    public static void main(String[] args) {
        try {
            throw new Exception("No, Billy! Don't throw an exception!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Can still do stuff afterwards!");
        }
    }
}
