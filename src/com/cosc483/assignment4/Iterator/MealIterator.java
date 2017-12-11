package com.cosc483.assignment4.Iterator;

import com.cosc483.assignment4.Aggregations.Menu;
import com.cosc483.assignment4.Aggregations.MenuItem;

public class MealIterator implements MenuIterator {
    private int type;
    private int current = 0;

    public MealIterator(int t){
        this.type = t;
    }

    public boolean hasNext() {
        return (!(current>= Menu.items.length || Menu.items[current] == null) && checker());
    }
    public boolean checker(){
        if(Menu.items[current].getMealType() == type){
            return true;
        }
        else{
            current++;
            return hasNext();
        }
    }

    public MenuItem getItem() {
        return (Menu.items)[current++];
    }

    public void next() {}
}