package com.dmytro.pdp.spring;

/**
 * Created by Dmytro_Olijnyk on 5/19/2015.
 */
public interface Messenger {

    default String printFinalMessage() {
        return "Java message 'Hello'";
    }

    ;
}
