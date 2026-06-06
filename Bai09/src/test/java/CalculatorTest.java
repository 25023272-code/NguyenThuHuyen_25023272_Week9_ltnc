package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() { assertEquals(8, calculator.add(5, 3)); }

    @Test
    public void testSubtract() { assertEquals(6, calculator.subtract(10, 4)); }

    @Test
    public void testMultiply() { assertEquals(42, calculator.multiply(6, 7)); }

    @Test
    public void testDivide() { assertEquals(5.0, calculator.divide(20, 4)); }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
