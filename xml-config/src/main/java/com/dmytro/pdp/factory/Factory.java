package com.dmytro.pdp.factory;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public class Factory {

    public static <R, T> R getInstanse(MyFuncFactory<R, T> cons, T value) {
        return cons.func(value);
    }

}
