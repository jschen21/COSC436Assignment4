package com.cosc483.assignment4.Iterator;

import com.cosc483.assignment4.Aggregations.MenuItem;
import com.cosc483.assignment4.Aggregations.Orders;

public class AllOrderIterator implements OrderIterator {
    private int current = 0;

    public boolean hasNext(){
        if((Orders.items).length == current){
            return false;
        }
        else{
            if((Orders.items)[current + 1] != null){
                return true;
            }
            return false;
        }
    }

    public MenuItem getItem(){
        return (Orders.items)[current];
    }

    public void next(){
        if(this.hasNext()){
            current++;
        }
        else{
            System.out.println("ERROR: There are no more available items");
        }
    }
}