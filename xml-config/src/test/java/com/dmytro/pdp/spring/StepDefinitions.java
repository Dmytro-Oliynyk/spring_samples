package com.dmytro.pdp.spring;

import cucumber.api.java8.En;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Dmytro_Olijnyk on 5/21/2015.
 */
public class StepDefinitions implements En {
    private static final Logger log = Logger.getLogger(UserManagerTest.class);
    private ApplicationContext context;
    private UserManager manager;

    public StepDefinitions() {
        Given("^I init spring context from (.*)$", (String configXml) -> {
            log.info("UserManagerTest: START");
            this.context = new ClassPathXmlApplicationContext(configXml);
        });
        When("^I get (.*)$", (String beanName) -> {
            this.manager = (UserManager) context.getBean(beanName);
            log.info("UserManagerTest: init object");
        });
        Then("^My user (.*) (.*) is in line$", (String firstName, String lastName) -> {
            Stream<User> userStream = this.manager.getUsers().stream().filter(user ->
                    user.getFirstName().equals(firstName) && user.getLastName().equals(lastName));
            assertNotNull(userStream);
            log.info(this.manager.printInfo());
            log.info("UserManagerTest: END");
        });
    }
}
