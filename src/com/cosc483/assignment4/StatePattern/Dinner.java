package com.cosc483.assignment4.StatePattern;

import com.cosc483.assignment4.Aggregations.Aggregator;
import com.cosc483.assignment4.Aggregations.Menu;
import com.cosc483.assignment4.Aggregations.MenuItem;
import com.cosc483.assignment4.Commands.Invoker;
import com.cosc483.assignment4.Iterator.MenuIterator;

public class Dinner implements State{
    private static Invoker invoker = new Invoker(new Aggregator());

    public void doAction(Context context){
        context.setState(this);
        Menu menu = invoker.getMenu();
        MenuIterator itr = menu.getMealIterator(3);

        System.out.println("------ Dinner Menu -------");

        String[] str = new String[100];
        int x = 0;
        while(itr.hasNext()){
            MenuItem i = itr.getItem();
            str[x] = String.format("%2d - %-31s $%.2f", i.getNumber() , i.getName(), i.getPrice());
            x++;
        }

        int y = 0;
        while(str[y] != null){
            System.out.println(str[y]);
            y++;
        }
    }
}
