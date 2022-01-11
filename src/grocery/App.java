package grocery;

public class App {
    public static void main(String[] args) {
        Stockroom sr = new Stockroom();
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

        System.out.println(sr.getItem("chicken noodle soup").toString());
        System.out.println(sr.getItem("beef chuck").toString());
        // need to catch these gosh darn null pointer exceptions
//        System.out.println(sr.getItem("hell dogs").toString());
    }
}
