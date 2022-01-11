package grocery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;

public class List {
    private final EnumMap<Category, ArrayList<Item>> list;

    public List() {
        list = new EnumMap<Category, ArrayList<Item>>(Category.class);
        for (Category cat : Category.values()) {
            list.put(cat, new ArrayList<>());
        }
    }

    public void addItemToList(Item item, int q) {
        Item newItem = new Item(item.getName(), item.getCategory(), q);
        list.get(item.getCategory()).add(newItem);
    }

    public void printList() {
        list.forEach((cat, items) -> items.forEach(System.out::println));
    }

    public void sortList() {
        for(Category cat : Category.values()) {
            Collections.sort(list.get(cat), new Comparator<Item>() {
                @Override
                public int compare(Item i1, Item i2) {
                    return i1.getName().compareToIgnoreCase(i2.getName());
                }
            });
        }
    }
}
