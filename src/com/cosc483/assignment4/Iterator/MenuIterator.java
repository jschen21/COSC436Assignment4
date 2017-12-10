package com.cosc483.assignment4.Iterator;

import com.cosc483.assignment4.Aggregations.MenuItem;

public interface MenuIterator {
    int current = 0;

    public boolean hasNext();

    public MenuItem getItem();

    public void next();
}
