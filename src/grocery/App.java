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

    private static void buildGroceryList(List list) {
        boolean cont = true;
        do {
            if (in.yesNo("Would you like to add a new item?")) {
                addItemToList(list);
            } else {
                finalizeList(list);
            }
        } while (cont);
    }

    // calling buildGroceryList with no parameters causes a new empty grocery list to be created
    private static void buildGroceryList() {
        List list = new List();
        buildGroceryList(list);
    }

    private static void editListMenu(List list) {
        String option = (in.getString("Would you like to edit or start over?"));

        if (option.equalsIgnoreCase("start over")) {
            buildGroceryList();
        } else if (option.equalsIgnoreCase("edit")) {
            editList(list);
        } else if (option.equalsIgnoreCase("cancel")) {
            System.out.println("Going back to finalization screen...");
        } else {
            System.out.println("Unrecognized input: " + option);
            editListMenu(list);
        }
    }

    private static void editList(List list) {
        boolean cont = true;
        do {
            int option = in.getInt(0, 3,
                    "What action do you wish to take?\n" +
                            "Enter the number next to the option.\n" +
                            "(1) Add a new item\n" +
                            "(2) Edit an item's quantity\n" +
                            "(3) Remove an item\n" +
                            "(0) Cancel");

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    cont = false;
                    break;
            }
        } while (cont);
    }

    private static void finalizeList(List list) {
        // finalize list
        list.sortList();
        System.out.println("Your shopping list:");
        list.printList();
        if(in.yesNo("Does this all look correct?")) {
            cont = false;
        } else {
            editListMenu(list);
        }
    }

    private static void addItemToList(List list) {
            System.out.println(sr.getCategories());
            String userCat = in.getString("Enter the category you wish you browse.");
            sr.listByCategory(userCat);
            String userSelect = in.getString("Enter the name of the item you wish to add to your list");
            int userQuantity = in.getInt(1, 100, "Enter the number of this item you wish to add");
            try {
                list.addItemToList(sr.getItem(userSelect), userQuantity);
                System.out.println("Item added!");
            } catch (NullPointerException e) {
                System.out.println("Incorrect item or quantity.");
            }
    }

    private static void populateStockroom() {
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
}