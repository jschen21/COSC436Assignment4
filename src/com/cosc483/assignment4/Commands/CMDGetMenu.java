package com.cosc483.assignment4.Commands;

import com.cosc483.assignment4.Aggregations.Aggregator;

public class CMDGetMenu implements CMDInterface {
    private Aggregator agg;

    public CMDGetMenu(Aggregator agg){
        this.agg = agg;
    }

    public Object execute(){
        return agg.getMenu();
    }
}
