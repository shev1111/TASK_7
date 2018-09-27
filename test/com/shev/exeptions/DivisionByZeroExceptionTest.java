package com.shev.exeptions;

import com.shev.math.BasicMath;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class DivisionByZeroExceptionTest {

    @Test
    public void testDivisionByZeroException() {
        String testString = "Division by zero!";
        try {
            BasicMath.divideNumbers(2,0);
            fail("Expected ivisionByZeroException");
        } catch (DivisionByZeroException ex) {
            assertTrue(testString.equals(ex.getMessage()));
        }
    }

}
