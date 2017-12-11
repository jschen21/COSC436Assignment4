package com.cosc483.assignment4.Aggregations;

import com.cosc483.assignment4.Iterator.AllitemsIterator;
import com.cosc483.assignment4.Iterator.MealIterator;
import com.cosc483.assignment4.Iterator.MenuIterator;

public class Menu {
    public static MenuItem[] items = new MenuItem[100];

    public Menu(){
        items[0] = new MenuItem(1,"BBQ Wings (5)", 3.99, 1);
        items[1] = new MenuItem(2,"Spinach Dip", 5.99, 1);
        items[2] = new MenuItem(3,"Loaded Potato Skins", 4.99, 1);
        items[3] = new MenuItem(4,"Crabby Fries", 6.99,1);
        items[4] = new MenuItem(5,"Crab Pretzel", 7.99, 1);
        items[5] = new MenuItem(6,"Shrimp Salad Wrap", 11.99, 1);
        items[6] = new MenuItem(7,"Maryland Crab Cake", 15.99, 2);
        items[7] = new MenuItem(8,"Garden Burger", 9.99, 2);
        items[8] = new MenuItem(9,"Bacon Cheeseburger", 10.99, 2);
        items[9] = new MenuItem(10,"Greek Salad", 9.99, 2);
        items[10] = new MenuItem(11,"Large Nachos Supreme", 10.99, 2);
        items[11] = new MenuItem(12,"Grilled Chicken Club", 10.99, 2);
        items[12] = new MenuItem(13,"Cheese Tortelinni w/ Pork", 4.99, 2);
        items[13] = new MenuItem(14,"Oreo Sundae", 6.99, 3);
        items[14] = new MenuItem(15,"Fresh Strawberries", 3.99, 3);
        items[15] = new MenuItem(16,"Churros", 4.99, 3);
        items[16] = new MenuItem(17,"Frech Fries", 3.49, 3);
        items[17] = new MenuItem(18,"Steamed Broccoli", 2.99, 3);
        items[18] = new MenuItem(19,"Green Beans", 2.99, 3);
        items[19] = new MenuItem(20,"Mashed Potatoes", 3.49, 3);
    }

    public MenuIterator getMenuIterator(){
        return new AllitemsIterator();
    }

    public MenuIterator getMealIterator(int m){
        return new MealIterator(m);
    }
}
