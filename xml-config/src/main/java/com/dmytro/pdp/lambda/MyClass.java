package com.dmytro.pdp.lambda;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public class MyClass<T> {

    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public MyClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
