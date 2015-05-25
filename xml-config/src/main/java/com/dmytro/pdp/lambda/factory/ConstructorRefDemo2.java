package com.dmytro.pdp.lambda.factory;

/**
 * Created by Dmytro_Olijnyk on 5/25/2015.
 */
public class ConstructorRefDemo2 {

    public static <R, T> R myClassFactory(MyFuncFactory<R, T> cons, T value) {
        return cons.func(value);
    }

    public static void main(String[] args) {
        MyFuncFactory<MyClassFactory<Double>, Double> myClassCons = MyClassFactory<Double>::new;
        MyClassFactory<Double> myClassFactory = myClassFactory(myClassCons, 100.1);
        System.out.println("MyClassFactory: value = " + myClassFactory.getValue());

        MyFuncFactory<MyClassFactory2, String> myClass2Cons = MyClassFactory2::new;
        MyClassFactory2 myClassFactory2 = myClassFactory(myClass2Cons, "Lamda Hi- hi");
        System.out.println("MyClassFactory2: str = " + myClassFactory2.getStr());
    }
}
