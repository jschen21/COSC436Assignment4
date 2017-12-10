package com.cosc483.assignment4.Commands;

import com.cosc483.assignment4.Aggregations.Aggregator;
import com.cosc483.assignment4.Aggregations.Menu;

public class CMDSubmitOrder implements CMDInterface {
    private Aggregator agg;
    private int[] order;

    public CMDSubmitOrder(Aggregator agg, int[] order){
        this.agg = agg;
        this.order = order;
    }

    public Object execute(){
        int x = 0;
        while(order[x] != 0){
            agg.submitOrder(Menu.items[order[x] - 1]);
            x++;
        }
        return true;
    }
}
