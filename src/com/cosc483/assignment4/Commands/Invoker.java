package com.cosc483.assignment4.Commands;

import com.cosc483.assignment4.Aggregations.Aggregator;
import com.cosc483.assignment4.Aggregations.Menu;
import com.cosc483.assignment4.Aggregations.Orders;
import com.cosc483.assignment4.Commands.CMDGetMenu;
import com.cosc483.assignment4.Commands.CMDGetTab;

public class Invoker {
    private Aggregator agg;

    public Invoker(Aggregator agg){
        this.agg = agg;
    }
    public Menu getMenu(){
        return (Menu) (new CMDGetMenu(agg)).execute();
    }
    public Orders getTab(){
        return (Orders)(new CMDGetTab(agg)).execute();
    }

    public void submitOrders(int[] orders){
        (new CMDSubmitOrder(agg, orders)).execute();
    }
}
