package com.cosc483.assignment4.Aggregations;

import com.cosc483.assignment4.Iterator.AllOrderIterator;
import com.cosc483.assignment4.Iterator.OrderIterator;

public class Orders {
    public static MenuItem[] items;

    public Orders(){
        items  = new MenuItem[100];
    }

    public void addItem(MenuItem i){
        int x = 0;
        while(x < 99){
            if(items[x] != null) x++;
            else break;
        }
        items[x] = i;
    }

    public double getTotal(){
        int x = 0;
        double temp = 0;
        while(items[x] != null){
            temp += items[x].getPrice();
            x++;
        }
        return temp;
    }

    public OrderIterator getOrdersIterator(){
        return new AllOrderIterator();
    }
}
