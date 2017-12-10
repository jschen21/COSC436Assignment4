package com.cosc483.assignment4.Aggregations;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public MenuItem(MenuItem m){
        this.name = m.name;
        this.price = m.price;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }
}
