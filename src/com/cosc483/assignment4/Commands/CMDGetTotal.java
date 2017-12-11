package com.cosc483.assignment4.Commands;

import com.cosc483.assignment4.Aggregations.Aggregator;

public class CMDGetTotal implements CMDInterface {
    private Aggregator agg;

    public CMDGetTotal(Aggregator agg){
        this.agg = agg;
    }

    public Object execute(){
        return agg.getTotal();
    }
}
