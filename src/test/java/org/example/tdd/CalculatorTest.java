package org.example.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
    
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }
    
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result);
    }
    
    @Test
    void testAddString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1,2,3");
        assertEquals(6, result);
    }
    
    @Test
    void testAddStringSingleNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.add("5");
        assertEquals(5, result);
    }
    
    @Test
    void testAddStringWithSpaces() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1, 2, 3");
        assertEquals(6, result);
    }
    
    @Test
    void testAddStringEmpty() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }
    
    @Test
    void testAddArray() {
        Calculator calculator = new Calculator();
        int result = calculator.add(new int[]{1, 2, 3});
        assertEquals(6, result);
    }
    
    @Test
    void testAddArrayEmpty() {
        Calculator calculator = new Calculator();
        int result = calculator.add(new int[]{});
        assertEquals(0, result);
    }
    
    @Test
    void testAddArraySingleElement() {
        Calculator calculator = new Calculator();
        int result = calculator.add(new int[]{5});
        assertEquals(5, result);
    }

}
