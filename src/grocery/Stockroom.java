package grocery;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;

public class Stockroom extends Inventory {
    public Stockroom() {
        super();
    }

    public void addToStock(Category cat, String name) {
        this.stock.get(cat).add(new Item(name, cat));
    }

}