package interfaces;

public class TJMaxxHomeGoodsTester {
    public static void main(String[] args) {
        Customer janet = new Customer("Janet", 68.75);
        janet.activity();
        System.out.println(janet.getWallet());
        janet.greeting();
        janet.failing();
        Employee marcus = new Employee();
        marcus.activity();
        marcus.greeting();
    }
}