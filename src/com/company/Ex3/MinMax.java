package com.company.Ex3;

/**
 * Created by Piotr on 2017-05-05.
 */
public class MinMax<T> {

    private T firstValue;
    private T lastValue;

    public MinMax(T firstValue, T lastValue) {
        this.firstValue = firstValue;
        this.lastValue = lastValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public T getLastValue() {
        return lastValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public void setLastValue(T lastValue) {
        this.lastValue = lastValue;
    }


}
