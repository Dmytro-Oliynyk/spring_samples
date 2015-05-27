package com.dmytro.pdp.lambda;

import cucumber.api.java8.En;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dmytro_Olijnyk on 5/26/2015.
 */
public class LambdaStepDefinitions implements En {
    private static final Logger log = Logger.getLogger(LambdaStepDefinitions.class);
    SomeFunc<String> stringSomeFunc;
    SomeFunc<Integer> integerSomeFunc;
    MyFunc<Integer> integerMyFunc;
    MyClass<Integer> myClass;
    String val1;
    Integer val2;

    public LambdaStepDefinitions() {
        Given("^I initiated reference on constructor and sad (.*?) and repeated it (\\d+) times.$", (String message, Integer num) -> {
            integerMyFunc = MyClass<Integer>::new;
            stringSomeFunc = str -> message +" - "+ str;
            integerSomeFunc = number -> number * num;
        });

        Then("^I call functions with parameters (.*?), (\\d+) and (\\d+).$", (String str, Integer val, Integer val2) -> {
            this.val1 = stringSomeFunc.func(str);
            this.val2 = integerSomeFunc.func(val);
            myClass = integerMyFunc.func(val2);
        });

        When("^Results: (.*?), (\\d+), (\\d+).$", (String expectedVal1, Integer expectedVal2, Integer expectedVal3) ->
        {
            assertEquals(expectedVal1, this.val1);
            assertEquals(expectedVal2, this.val2);
            assertEquals(expectedVal3, myClass.getVal());
        });
    }
}
