package grocery;

import java.util.*;

public class ShoppingList extends Inventory {
    public ShoppingList() {
        super();
    }

    public void addItemToList(Item item, int q) {
        Item newItem = new Item(item.getName(), item.getCategory(), q);
        this.stock.get(item.getCategory()).add(newItem);
    }

    public void printList() {
        this.stock.forEach((cat, items) -> {
            if (!this.stock.get(cat).isEmpty()) System.out.println("_______________\n" + cat.toString());
            items.forEach(Item::print);
        });
    }

    public void sortList() {
        for(Category cat : Category.values()) {
            Collections.sort(this.stock.get(cat), new Comparator<Item>() {
                @Override
                public int compare(Item i1, Item i2) {
                    return i1.getName().compareToIgnoreCase(i2.getName());
                }
            });
        }
    }

    @Override
    public String getCategories() {
        StringBuffer sb = new StringBuffer("Categories:");
        for (Category cat : Category.values()) {
            // don't display empty categories
            if (!this.stock.get(cat).isEmpty()) {
                sb.append('\n').append(cat.toString());
            }
        }

        return sb.toString();
    }

}
