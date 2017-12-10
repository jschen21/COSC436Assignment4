package com.cosc483.assignment4.Commands;

import com.cosc483.assignment4.Aggregations.Aggregator;

public class CMDGetTab implements CMDInterface {
    private Aggregator agg;

    public CMDGetTab(Aggregator agg){
        this.agg = agg;
    }

    public Object execute(){
        return agg.getOrders();
    }
}
