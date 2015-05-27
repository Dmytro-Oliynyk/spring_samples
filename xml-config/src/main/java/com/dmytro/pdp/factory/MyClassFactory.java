package com.dmytro.pdp.factory;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public class MyClassFactory<T> {
    private T value;

    public MyClassFactory() {
        this.value = null;
    }
    public MyClassFactory(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
