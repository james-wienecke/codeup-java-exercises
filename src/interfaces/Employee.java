package interfaces;

public class Employee extends Person implements Being{
    @Override
    public void activity() {
        System.out.println("Beep beep, I'm a cashier.");
    }

    @Override
    public void greeting() {
        System.out.println("Hi welcome to our store. Did you have any coupons?");
    }
}