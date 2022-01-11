package grocery;

import util.Input;

public class App {
    private static Stockroom sr = new Stockroom();
    private static Input in = new Input();
    public static void main(String[] args) {
        sr = new Stockroom();
        populateStockroom();

        if (in.yesNo("Would you like to start a new grocery list?")) {
            buildGroceryList();
        }

    }

    public static void populateStockroom() {
        // CANNED
        sr.addToStock(Category.CANNED, "chicken noodle soup");
        sr.addToStock(Category.CANNED, "tomato soup");
        sr.addToStock(Category.CANNED, "spam");
        // FROZEN
        sr.addToStock(Category.FROZEN, "potato wedges");
        sr.addToStock(Category.FROZEN, "fish sticks");
        sr.addToStock(Category.FROZEN, "ice cream");
        sr.addToStock(Category.FROZEN, "green chile burrito");
        // FRUITS
        sr.addToStock(Category.FRUITS, "apple");
        sr.addToStock(Category.FRUITS, "orange");
        sr.addToStock(Category.FRUITS, "lime");
        sr.addToStock(Category.FRUITS, "pear");
        // VEGETABLES
        sr.addToStock(Category.VEGETABLES, "broccoli");
        sr.addToStock(Category.VEGETABLES, "carrot");
        sr.addToStock(Category.VEGETABLES, "onion");
        sr.addToStock(Category.VEGETABLES, "garlic");
        sr.addToStock(Category.VEGETABLES, "cabbage");
        // MEAT
        sr.addToStock(Category.MEAT, "beef chuck");
        sr.addToStock(Category.MEAT, "ground beef");
        sr.addToStock(Category.MEAT, "breakfast sausage");
        sr.addToStock(Category.MEAT, "bacon");
    }

    private static void buildGroceryList() {
        do {
            if (in.yesNo("Would you like to add a new item?")) {
                System.out.println("Too bad!");
            }
        } while (true);
    }
}
