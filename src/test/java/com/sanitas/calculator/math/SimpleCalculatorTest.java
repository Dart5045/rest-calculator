package com.sanitas.calculator.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class SimpleCalculatorTest {

    @Test
    void shouldCalculateExpression() {
        // Given
        BigDecimal number1 = new BigDecimal("20");
        BigDecimal number2 = new BigDecimal("30");

        // When
        final SimpleCalculator simpleCalculator = new AddExpression(number1, number2);
        simpleCalculator.evaluate();

        // Then
        final double expectedResult = Double.parseDouble("50");
        Assertions.assertEquals(expectedResult, simpleCalculator.getResult());
    }

    @Test
    void shouldCalculateSubtractExpression() {
        // Given
        BigDecimal number1 = new BigDecimal("30");
        BigDecimal number2 = new BigDecimal("10");

        // When
        final SimpleCalculator simpleCalculator = new SubtractExpression(number1, number2);
        simpleCalculator.evaluate();

        // Then
        final double expectedResult = Double.parseDouble("20");
        Assertions.assertEquals(expectedResult, simpleCalculator.getResult());
    }
}