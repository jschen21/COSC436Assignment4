package com.cosc483.assignment4.Aggregations;

import com.cosc483.assignment4.Iterator.AllitemsIterator;
import com.cosc483.assignment4.Iterator.MealIterator;
import com.cosc483.assignment4.Iterator.MenuIterator;

public class Menu {
    public static MenuItem[] items = new MenuItem[100];

    public Menu(){
        items[0] = new MenuItem(1,"Pot Roast Hash", 9.39, 1);
        items[1] = new MenuItem(2,"Slow Roasted Pot Roast", 10.29, 3);
        items[2] = new MenuItem(3,"Crab Cake Sandwich", 16.99, 2);
        items[3] = new MenuItem(4,"Ham Biscuit Benedict", 9.19,1);
        items[4] = new MenuItem(5,"Parmesan Grilled Chicken", 8.99, 3);
        items[5] = new MenuItem(6,"Fish and Chips", 11.99, 2);
        items[6] = new MenuItem(7,"Ham & Cheese Club", 9.99, 2);
        items[7] = new MenuItem(8,"Slow Roasted Chicken Pot Pie", 7.99, 3);
        items[8] = new MenuItem(9,"Sausage Gravy & Biscuits", 4.79, 1);
        items[9] = new MenuItem(10,"Grilled Salmon Fillet", 13.29, 3);
        items[10] = new MenuItem(11,"BLT Sandwich", 6.52, 2);
        items[11] = new MenuItem(12,"Grilled Fish Filet", 8.99, 2);
        items[12] = new MenuItem(13,"Bacon Cheese Burger", 8.99, 2);
        items[13] = new MenuItem(14,"Belgian Waffle Breakfast", 7.69, 1);
        items[14] = new MenuItem(15,"Meatloaf and Mashed Potatoes", 7.99, 3);
        items[15] = new MenuItem(16,"Veggie Omelet", 8.99, 1);
        items[16] = new MenuItem(17,"Country Fried Steak Dinner", 7.99, 3);
        items[17] = new MenuItem(18,"Chicken Caesar Salad", 7.99, 2);
        items[18] = new MenuItem(19,"Brioche French Toast", 4.99, 1);
        items[19] = new MenuItem(20,"USDA Choice Sirloin Dinner", 12.29, 3);
    }

    public MenuIterator getMenuIterator(){
        return new AllitemsIterator();
    }

    public MenuIterator getMealIterator(int m){
        return new MealIterator(m);
    }
}
