package com.shev.math;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class BasicMathTest {
    @org.junit.Test
    public void divideNumbers() throws Exception {
        int testDivider = 4;
        int testDivisible = 8;
        int expectResult = 2;
        assertTrue(BasicMath.divideNumbers(testDivisible,testDivider)==expectResult);
    }


}
