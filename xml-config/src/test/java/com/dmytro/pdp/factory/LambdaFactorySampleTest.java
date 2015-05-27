package com.dmytro.pdp.factory;

/**
 * Created by Dmytro_Olijnyk on 5/26/2015.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class LambdaFactorySampleTest {
}
