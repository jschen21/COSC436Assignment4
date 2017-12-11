package com.cosc483.assignment4.SystemInterface;

import com.cosc483.assignment4.Aggregations.Aggregator;
import com.cosc483.assignment4.Aggregations.Menu;
import com.cosc483.assignment4.Aggregations.MenuItem;
import com.cosc483.assignment4.Aggregations.Orders;
import com.cosc483.assignment4.Commands.Invoker;
import com.cosc483.assignment4.Iterator.MenuIterator;
import com.cosc483.assignment4.Iterator.OrderIterator;

public class SystemInterface {
    private static Invoker invoker = new Invoker(new Aggregator());

    public static String[] getMenu() {
        Menu menu = invoker.getMenu();
        MenuIterator itr = menu.getMenuIterator();

        String[] str = new String[100];
        int x = 0;
        do {
            if (x != 0) itr.next();
            MenuItem i = itr.getItem();
            str[x] = String.format("%2d - %-31s $%.2f", i.getNumber(), i.getName(), i.getPrice());
            x++;
        } while (itr.hasNext());
        return str;
    }

    public static String[] submitOrder(int[] orders) {
        invoker.submitOrders(orders);
        String[] str = new String[10];
        str[0] = "Order Successfully submitted!";
        return str;
    }

    public static String[] getOrder() {
        Orders order = invoker.getOrders();
        OrderIterator itr = order.getOrdersIterator();

        String[] str = new String[100];
        int x = 0;
        do {
            if (x != 0) itr.next();
            MenuItem i = itr.getItem();
            str[x] = String.format("%2d - %-31s $%.2f", i.getNumber(), i.getName(), i.getPrice());
            x++;
        } while (itr.hasNext());
        return str;
    }

    public static  double getTotal(){
        return invoker.getTotal();
    }
}
