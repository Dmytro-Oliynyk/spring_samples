package com.dmytro.pdp.factory;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public class MyClassFactory2 {
    String str;

    public MyClassFactory2() {
        this.str = "";
    }

    public MyClassFactory2(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
