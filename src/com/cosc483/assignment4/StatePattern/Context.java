package com.cosc483.assignment4.StatePattern;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }
}
