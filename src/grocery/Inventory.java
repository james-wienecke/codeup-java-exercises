package grocery;

import java.util.ArrayList;
import java.util.EnumMap;

public abstract class Inventory {
    EnumMap<Category, ArrayList<Item>> stock;

    Inventory() {
        stock = new EnumMap<Category, ArrayList<Item>>(Category.class);
        for (Category cat : Category.values()) {
            stock.put(cat, new ArrayList<>());
        }
    }
}
