package grocery;

import util.Input;

import java.util.Collections;

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
        // DAIRY
        sr.addToStock(Category.DAIRY, "milk");
        sr.addToStock(Category.DAIRY, "butter");
        sr.addToStock(Category.DAIRY, "eggs");
        sr.addToStock(Category.DAIRY, "creamer");
        sr.addToStock(Category.DAIRY, "yoghurt");
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
        boolean cont = true;
        List list = new List();
        do {
            if (in.yesNo("Would you like to add a new item?")) {

                String userIn = in.getString("Enter the category you wish you browse.");

            } else {
                // finalize list
                list.sortList();
                list.printList();
                cont = false;
            }
        } while (cont);
    }
}

//                list.addItemToList(sr.getItem("ground beef"), 5);
//                list.addItemToList(sr.getItem("bacon"), 12);
//                list.addItemToList(sr.getItem("broccoli"), 2);
//                list.addItemToList(sr.getItem("onion"), 2);
//                list.addItemToList(sr.getItem("milk"), 3);
//                list.addItemToList(sr.getItem("garlic"), 4);
//                list.addItemToList(sr.getItem("carrot"), 200);
