package com.shev;

import com.shev.exeptions.DivisionByZeroException;
import com.shev.math.BasicMath;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
            BasicMath.divideNumbers(12,0);
        } catch (DivisionByZeroException e) {
            logger.warning(e.getMessage() +" caused by "+e.getCause());
        }
    }
}
