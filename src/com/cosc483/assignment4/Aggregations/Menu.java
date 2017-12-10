package com.cosc483.assignment4.Aggregations;

import com.cosc483.assignment4.Iterator.AllitemsIterator;
import com.cosc483.assignment4.Iterator.MenuIterator;

public class Menu {
    public static MenuItem[] items = new MenuItem[100];

    public Menu(){
        items[0] = new MenuItem("BBQ Wings (5)", 3.99);
        items[1] = new MenuItem("Spinach Dip", 5.99);
        items[2] = new MenuItem("Loaded Potato Skins", 4.99);
        items[3] = new MenuItem("Crabby Fries", 6.99);
        items[4] = new MenuItem("Crab Pretzel", 7.99);
        items[5] = new MenuItem("Shrimp Salad Wrap", 11.99);
        items[6] = new MenuItem("Maryland Crab Cake", 15.99);
        items[7] = new MenuItem("Garden Burger", 9.99);
        items[8] = new MenuItem("Bacon Cheeseburger", 10.99);
        items[9] = new MenuItem("Greek Salad", 9.99);
        items[10] = new MenuItem("Large Nachos Supreme", 10.99);
        items[11] = new MenuItem("Grilled Chicken Club", 10.99);
        items[12] = new MenuItem("Cheese Tortelinni w/ Pork", 4.99);
        items[13] = new MenuItem("Oreo Sundae", 6.99);
        items[14] = new MenuItem("Fresh Strawberries", 3.99);
        items[15] = new MenuItem("Churros", 4.99);
        items[16] = new MenuItem("Frech Fries", 3.49);
        items[17] = new MenuItem("Steamed Broccoli", 2.99);
        items[18] = new MenuItem("Green Beans", 2.99);
        items[19] = new MenuItem("Mashed Potatoes", 3.49);
    }

    public void addItem(MenuItem i){
        int x = 0;
        while(x < 99){
            if(items[x] != null)
                x++;
            else
                break;
        }
        items[x] = i;
    }

    public static MenuItem getItems(int i) {
        return items[i];
    }

    public MenuIterator getMenuIterator(){
        return new AllitemsIterator();
    }
}
