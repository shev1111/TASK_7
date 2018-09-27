package com.shev.math;

import com.shev.exeptions.DivisionByZeroException;

public class BasicMath {

   public static int divideNumbers(int divisible, int divider)throws DivisionByZeroException{
        try {
            return divisible/divider;
        }catch (ArithmeticException e){
            throw new DivisionByZeroException("Division by zero!", e);
        }
    }
}
