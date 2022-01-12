package grocery;

import java.util.*;

public abstract class Inventory {
    EnumMap<Category, ArrayList<Item>> stock;

    Inventory() {
        stock = new EnumMap<Category, ArrayList<Item>>(Category.class);
        for (Category cat : Category.values()) {
            stock.put(cat, new ArrayList<>());
        }
    }

    public String getCategories() {
        StringBuffer sb = new StringBuffer("Categories:");
        for (Category cat : Category.values()) {
            sb.append('\n').append(cat.toString());
        }

        return sb.toString();
    }


    public void listByCategory(String str) {
        Category selected = null;

        switch (str.toLowerCase(Locale.ROOT)) {
            case "dairy":
                selected = Category.DAIRY;
                break;
            case "frozen":
                selected = Category.FROZEN;
                break;
            case "canned":
                selected = Category.CANNED;
                break;
            case "meat":
                selected = Category.MEAT;
                break;
            case "fruits":
                selected = Category.FRUITS;
                break;
            case "vegetables":
                selected = Category.VEGETABLES;
                break;
        }
        if (selected != null) {
            if (this.stock.get(selected).isEmpty()) {
                System.out.println("No items in category: " + selected);
            } else if (!this.stock.get(selected).isEmpty()) {
                System.out.println(selected);
                for (Item item : this.stock.get(selected)) {
                    System.out.println(item.getName());
                }
            }
        } else if (selected == null) {
            System.out.println("Unknown category");
        }
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

    public void removeItem(Item tgtItem) {
        for (Category category : this.stock.keySet()) {
            this.stock.get(category).removeIf(item -> Objects.equals(item.getName(), tgtItem.getName()));
        }
    }
}
