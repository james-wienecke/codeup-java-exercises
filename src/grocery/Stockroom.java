package grocery;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;

public class Stockroom {
    private final EnumMap<Category, ArrayList<Item>> stock;

    public Stockroom() {
        stock = new EnumMap<Category, ArrayList<Item>>(Category.class);
        for (Category cat : Category.values()) {
            stock.put(cat, new ArrayList<>());
        }
    }

    public void addToStock(Category cat, String name) {
        stock.get(cat).add(new Item(name, cat));
    }

    public Item getItem(String name) {

        ArrayList<Item> found = new ArrayList<>();
        stock.forEach(((category, items) -> {
            items.forEach(item -> {
                if (name.equalsIgnoreCase(item.getName())) found.add(item);
            });
        }));

        if (found.isEmpty()) return null;
        else return found.get(0);
    }

    public String getCategories() {
        StringBuffer sb = new StringBuffer("Categories:");
        for (Category cat : Category.values()) {
            sb.append('\n').append(cat.toString());
        }

        return sb.toString();
    }

    public void listByCategory(String str) {
        switch (str.toLowerCase(Locale.ROOT)) {
            case "dairy":
                System.out.println(Category.DAIRY.toString());
                for (Item item : stock.get(Category.DAIRY)) {
                    System.out.println(item.getName());
                }
                break;
            case "frozen":
                System.out.println(Category.FROZEN.toString());
                for (Item item : stock.get(Category.FROZEN)) {
                    System.out.println(item.getName());
                }
                break;
            case "canned":
                System.out.println(Category.CANNED.toString());
                for (Item item : stock.get(Category.CANNED)) {
                    System.out.println(item.getName());
                }
                break;
            case "meat":
                System.out.println(Category.MEAT.toString());
                for (Item item : stock.get(Category.MEAT)) {
                    System.out.println(item.getName());
                }
                break;
            case "fruits":
                System.out.println(Category.FRUITS.toString());
                for (Item item : stock.get(Category.FRUITS)) {
                    System.out.println(item.getName());
                }
                break;
            case "vegetables":
                System.out.println(Category.VEGETABLES.toString());
                for (Item item : stock.get(Category.VEGETABLES)) {
                    System.out.println(item.getName());
                }
                break;
            default:
                System.out.println("Unknown category.");
        }
    }
}