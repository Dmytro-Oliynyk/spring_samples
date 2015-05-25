package com.dmytro.pdp.lambda;

/**
 * Created by Dmytro_Olijnyk on 5/22/2015.
 */
public class Main {
    public static void main(String[] args) {
        SomeFunc<String> stringSomeFunc = (str) -> {
            return "String Hello"+str;
        };
        SomeFunc<Integer> integerSomeFunc = (number) -> {
            return number * 100;
        };

        System.out.println(stringSomeFunc.func("TEST"));
        System.out.println(integerSomeFunc.func(45));
    }

}
