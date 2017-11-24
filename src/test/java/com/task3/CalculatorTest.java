package com.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    private Calculator calculator = new Calculator();
    @Test(expected = CalculatorException.class)
    public void factoryMethod() throws Exception {
        calculator.factoryMethod("");
        calculator.factoryMethod("2+");
    }

    @Test
    public void plus() throws Exception {
        assertEquals(11, calculator.factoryMethod("4+7"), DELTA);
    }

    @Test
    public void minus() throws Exception {
        assertEquals(-3, calculator.factoryMethod("4-7"), DELTA);
    }

    @Test
    public void mult() throws Exception {
        assertEquals(28, calculator.factoryMethod("4*7"), DELTA);
    }

    @Test
    public void div() throws Exception {
        assertEquals(0.5, calculator.factoryMethod("1/2"), DELTA);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divInNull() throws Exception {
        calculator.factoryMethod("1/0");
    }

}