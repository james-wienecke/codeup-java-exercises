package grocery;

public class App {
    public static void main(String[] args) {
        Stockroom stockroom = new Stockroom();
        stockroom.addToStock(Category.CANNED, new Item("chicken noodle soup", Category.CANNED));

//        System.out.println(stockroom.getItem("chicken noodle soup").toString());
    }
}
