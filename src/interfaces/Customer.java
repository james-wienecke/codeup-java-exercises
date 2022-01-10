package interfaces;

public class Customer implements Person {

    @Override
    public void activity() {
        System.out.println("Buying stuff...");
    }
}
