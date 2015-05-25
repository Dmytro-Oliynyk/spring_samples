package com.dmytro.pdp.lambda;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc<Integer> integerMyFunc = MyClass<Integer>::new;

        MyClass<Integer> myClass =  integerMyFunc.func(100);

        System.out.println("val = " +myClass.getVal());
    }}
