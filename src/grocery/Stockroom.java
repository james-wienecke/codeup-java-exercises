package grocery;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;

public class Stockroom extends Inventory {
    public Stockroom() {
        super();
    }

    public void addToStock(Category cat, String name) {
        this.stock.get(cat).add(new Item(name, cat));
    }

    public Item getItem(String name) {

        ArrayList<Item> found = new ArrayList<>();
        this.stock.forEach(((category, items) -> {
            items.forEach(item -> {
                if (name.equalsIgnoreCase(item.getName())) found.add(item);
            });
        }));

        if (found.isEmpty()) return null;
        else return found.get(0);
    }
}