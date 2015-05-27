package com.dmytro.pdp.factory;

import cucumber.api.java8.En;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dmytro_Olijnyk on 5/26/2015.
 */
public class LambdaFactoryStepDefinitions implements En {
    private static final Logger log = Logger.getLogger(LambdaFactoryStepDefinitions.class);
    MyFuncFactory<MyClassFactory<Double>, Double> myClassCons;
    MyClassFactory<Double> myClassFactory;
    MyFuncFactory<MyClassFactory2, String> myClass2Cons;
    MyClassFactory2 myClassFactory2;

    public LambdaFactoryStepDefinitions() {
        Given("^I initiated reference on constructor.", () -> {
           myClassCons = MyClassFactory<Double>::new;
           myClass2Cons = MyClassFactory2::new;
        });

        Then("^I call functions with parameters (.*?) and (\\d+).$", (String str, Double val) -> {
           myClassFactory = Factory.getInstanse(myClassCons, val);
           myClassFactory2 = Factory.getInstanse(myClass2Cons, str);
        });

        When("^Results: (.*?) and (\\d+).$", (String expectedVal1, Double expectedVal2) ->
        {
            assertEquals(expectedVal2, myClassFactory.getValue());
            assertEquals(expectedVal1, myClassFactory2.getStr());
        });
    }
}
