package com.dmytro.pdp.lambda.factory;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public interface MyFuncFactory<R, T> {
    R func(T t);

}
