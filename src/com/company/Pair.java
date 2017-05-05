package com.company;

/**
 * Created by Piotr on 2017-05-05.
 */
public class Pair<T, X> {
    private T first;
    private X last;

    public Pair(T first, X last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public X getLast() {
        return last;
    }

    public void setLast(X last) {
        this.last = last;
    }
}

