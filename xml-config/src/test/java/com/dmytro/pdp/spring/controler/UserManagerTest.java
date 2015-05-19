package com.dmytro.pdp.spring.controler;

import com.dmytro.pdp.spring.UserManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmytro_Olijnyk on 5/18/2015.
 */

public class UserManagerTest {

    @Test
    public void xmlDI_And_SpEL() throws Exception {
        System.out.printf("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserManager manager = (UserManager) context.getBean("usersSet");

        System.out.println(manager.printInfo());
        System.out.printf("END");
    }
}