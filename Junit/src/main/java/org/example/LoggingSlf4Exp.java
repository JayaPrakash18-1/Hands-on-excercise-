package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingSlf4Exp {
    private static final Logger logger= LoggerFactory.getLogger(LoggingSlf4Exp.class);
    public static void main(String[] args){
        logger.error("This is Error");
        logger.warn("This is Warning");

    }
}
