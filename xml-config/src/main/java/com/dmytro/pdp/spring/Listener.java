package com.dmytro.pdp.spring;

import org.apache.log4j.Logger;

/**
 * Created by Dmytro_Olijnyk on 5/15/2015.
 */
public class Listener {
    private static final Logger log = Logger.getLogger(Listener.class);
    public void before() {
        log.info("Listener: Before");
    }
    public void after() {
        log.info("Listener: After");
    }
}
