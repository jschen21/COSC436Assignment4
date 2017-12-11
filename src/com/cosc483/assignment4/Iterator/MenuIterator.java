package com.cosc483.assignment4.Iterator;

import com.cosc483.assignment4.Aggregations.MenuItem;

public interface MenuIterator {
    int current = 0;

    boolean hasNext();

    MenuItem getItem();

    void next();
}
