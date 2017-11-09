package com.junit;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator c = new Calculator();

    //test multiply method for varying conditions
    @Test
    public void multiply() throws Exception {
        assertEquals(4,c.multiply(2,2));
        assertEquals(4,c.multiply(2));
        assertNotEquals(6, c.multiply(3,3));
    }
    //test divide method
    @Test
    public void divide() throws Exception {
        assertEquals(6,c.divide(2,12));
        assertNotEquals(8, c.divide(3,27));

    }
    //test subtract method
    @Test
    public void subtract() throws Exception {
        assertEquals(8,c.subtract(4,12));
        assertNotEquals(3,c.subtract(4,8));
    }
    //test add method
    @Test
    public void add() throws Exception {
        assertEquals(10,c.add(6,4));
        assertNotEquals(10, c.add(8,3));
    }

}