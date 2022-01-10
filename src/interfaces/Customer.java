package interfaces;

public class Customer extends Person implements Being, Fallible {
    private double wallet;

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Customer(String name, double wallet) {
        this.setName(name);
        this.wallet = wallet;
    }

    public void activity() {
        System.out.println("Just browsin' around. Don't mind me.");
    }

    public void greeting() {
        System.out.printf("Hello my name is %s. Give me all the discounts.%n", this.getName());
    }

    public void failing() {
        System.out.println("Oops, I left my card at home. I'll be back.");
    }
}