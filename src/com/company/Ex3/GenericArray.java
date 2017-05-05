package com.company.Ex3;

/**
 * Created by Piotr on 2017-05-05.
 */
public class GenericArray<T> {

    private T[] someArray;

    public GenericArray(T... someArray) {
        this.someArray = someArray;
    }

    public MinMax<T> getMinMax() {
        return new MinMax<>(someArray[0], someArray[someArray.length - 1]);
    }

}
