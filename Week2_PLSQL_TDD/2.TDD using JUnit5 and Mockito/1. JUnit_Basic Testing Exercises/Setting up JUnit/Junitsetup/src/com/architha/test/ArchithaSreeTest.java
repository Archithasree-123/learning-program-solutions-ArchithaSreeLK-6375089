package com.architha.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArchithaSreeTest {

    class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals("Sum should be 10", 10, calc.add(7, 3));
    }

    @Test
    public void testAdditionFailCase() {
        Calculator calc = new Calculator();
        assertNotEquals("Sum should not be 5", 5, calc.add(2, 2));
    }

    @Test
    public void testWithZero() {
        Calculator calc = new Calculator();
        assertEquals("Sum should be 0", 0, calc.add(0, 0));
    }
}
