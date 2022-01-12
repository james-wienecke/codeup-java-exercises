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

    private static void buildGroceryList(ShoppingList shoppingList) {
        boolean cont = true;
        do {
            if (in.yesNo("Would you like to add a new item?")) {
                addItemToList(shoppingList);
            } else {
                cont = finalizeList(shoppingList);
            }
        } while (cont);
    }

    // calling buildGroceryList with no parameters causes a new empty grocery list to be created
    private static void buildGroceryList() {
        ShoppingList shoppingList = new ShoppingList();
        buildGroceryList(shoppingList);
    }

    private static void editListMenu(ShoppingList shoppingList) {
        String option = (in.getString("Would you like to edit or start over?"));

        if (option.equalsIgnoreCase("start over")) {
            buildGroceryList();
        } else if (option.equalsIgnoreCase("edit")) {
            editList(shoppingList);
        } else if (option.equalsIgnoreCase("cancel")) {
            System.out.println("Going back to finalization screen...");
        } else {
            System.out.println("Unrecognized input: " + option);
            editListMenu(shoppingList);
        }
    }

    private static void editList(ShoppingList shoppingList) {
        boolean cont = true;
        do {
            int option = in.getInt(0, 3,
                    "What action do you wish to take?\n" +
                            "Enter the number next to the option.\n" +
                            "(1) Add a new item\n" +
                            "(2) Edit an item's quantity\n" +
                            "(3) Remove an item\n" +
                            "(0) Done");

            switch (option) {
                case 1:
                    addItemToList(shoppingList);
                    break;
                case 2:
                    editListItemQuantity(shoppingList);
                    break;
                case 3:
                    removeListItem(shoppingList);
                    break;
                case 0:
                    cont = false;
                    break;
            }
        } while (cont);

    }

    private static boolean finalizeList(ShoppingList shoppingList) {
        boolean cont = true;
        // finalize list
        do {
            shoppingList.sortList();
            System.out.println("Your shopping list:");
            shoppingList.printList();
            if(in.yesNo("Does this all look correct?")) {
                cont = false;
            } else {
                editListMenu(shoppingList);
            }
        } while (cont);
        return false;
    }

    private static void removeListItem(ShoppingList shoppingList) {
        System.out.println(shoppingList.getCategories());
        String userCat = in.getString("Enter the category you wish you browse.");
        shoppingList.listByCategory(userCat);
        String userSelect = in.getString("Enter the name of the item you wish to remove.");
        try {
            Item item = shoppingList.getItem(userSelect);
            shoppingList.removeItem(item);
        } catch (NullPointerException e) {
            System.out.println("Incorrect item.");
        }
    }

    private static void editListItemQuantity(ShoppingList shoppingList) {
        System.out.println(shoppingList.getCategories());
        String userCat = in.getString("Enter the category you wish you browse.");
        shoppingList.listByCategory(userCat);
        String userSelect = in.getString("Enter the name of the item you wish to edit.");
        int userQuantity = in.getInt(0, 100, "Enter the new quantity.");
        try {
            if (userQuantity == 0) {
                Item item = shoppingList.getItem(userSelect);
                shoppingList.removeItem(item);
                System.out.println("Item removed");
            } else {
                shoppingList.getItem(userSelect).setQuantity(userQuantity);
                System.out.println("Quantity edited!");
            }
        } catch (NullPointerException e) {
            System.out.println("Incorrect item or quantity.");
        }
    }

    private static void addItemToList(ShoppingList shoppingList) {
            System.out.println(sr.getCategories());
            String userCat = in.getString("Enter the category you wish you browse.");
            sr.listByCategory(userCat);
            String userSelect = in.getString("Enter the name of the item you wish to add to your list");
            int userQuantity = in.getInt(1, 100, "Enter the number of this item you wish to add");
            try {
                shoppingList.addItemToList(sr.getItem(userSelect), userQuantity);
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