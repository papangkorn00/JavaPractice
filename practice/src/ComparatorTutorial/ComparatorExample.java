package ComparatorTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Coke", "Drinks", 20F, 100));
        items.add(new Item("Lego", "Toys", 13F, 56));
        items.add(new Item("Oreo", "Snacks", 22F, 25));
        items.add(new Item("Sprite", "Drinks", 30F, 90));
        items.add(new Item("Coke", "Drinks", 25F, 78));
        items.add(new Item("Lays", "Snacks", 10F, 89));
//        items.sort(new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(items);
        
        
        for (Item i : items){
            System.out.printf(
                    "name: %s, category: %s , price: %2f, stocks: %d %n",
                    i.getName(),i.getCategory(),i.getPrice(),i.getStocks()
            );
        }
    }
}

class Item implements Comparable<Item> {

    private String name;
    private String category;
    private float price;
    private int stocks;

    public Item(String name, String category, float price, int stocks) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    @Override
    public int compareTo(Item o) {
        //sort by category then sort by name
        if(this.getCategory().equalsIgnoreCase(o.category)){
            return this.getName().compareToIgnoreCase(o.getName());
        }
            return this.getCategory().compareToIgnoreCase(o.getCategory());
    }

}
