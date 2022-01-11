package grocery;

public class Item {
    private String name;
    private Category category;
    private int quantity;

    public Item(String name, Category cat) {
        this.name = name;
        this.category = cat;
        this.quantity = -1;
    }

    public Item(String name, Category cat, int quantity) {
        this.name = name;
        this.category = cat;
        this.quantity = quantity;
    }
}
