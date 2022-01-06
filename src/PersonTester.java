public class PersonTester {
    public static void main(String[] args) {
        Person tiffany = new Person();
        tiffany.setName("Tiffany");
        System.out.println(tiffany.getName());
        Person joe = new Person();
        joe.setName("Joe");
        System.out.println(joe.sayHello());
    }
}