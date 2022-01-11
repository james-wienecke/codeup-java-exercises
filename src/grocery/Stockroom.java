package grocery;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;

public class Stockroom {
    private final EnumMap<Category, ArrayList<Item>> stock;

    public Stockroom() {
        stock = new EnumMap<Category, ArrayList<Item>>(Category.class);
        for (Category cat : Category.values()) {
            stock.put(cat, new ArrayList<>());
        }
    }

    public EnumMap<Category, ArrayList<Item>> addToStock(Category cat, Item item) {
        stock.get(cat).add(item);
        return stock;
    }

    public Item getItem(String name) {
//        stock.forEach((cat, items) -> items.forEach(System.out::println));
        ArrayList<Item> found = new ArrayList<>();
        stock.forEach(((category, items) -> {
            items.forEach(item -> {
                if (name.equalsIgnoreCase(item.getName())) found.add(item);
            });
        }));

        if (found.isEmpty()) return null;
        else return found.get(0);
    }
}