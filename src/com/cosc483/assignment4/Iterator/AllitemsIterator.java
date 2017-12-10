package com.cosc483.assignment4.Iterator;

import com.cosc483.assignment4.Aggregations.Menu;
import com.cosc483.assignment4.Aggregations.MenuItem;

public class AllitemsIterator implements MenuIterator{
    private int current = 0;

    public boolean hasNext(){
        if(Menu.items.length == current){
            return false;
        }
        else{
            if(Menu.items[current + 1] != null){
                return true;
            }
            return false;
        }
    }

    public MenuItem getItem() {
        return (Menu.items)[current];
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
