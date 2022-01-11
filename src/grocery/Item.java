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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", quantity=" + quantity +
                '}';
    }
}
