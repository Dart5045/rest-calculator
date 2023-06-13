package com.sanitas.calculator.services;

import com.sanitas.calculator.utils.OperationTypeEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.Assertions;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

@ExtendWith(SpringExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorServiceImpl calculatorService;

    @Test
    void shouldCalculateSumWhenRequested() {
        // Given
        BigDecimal number1 = new BigDecimal("2");
        BigDecimal number2 = new BigDecimal("3");


        // When
        final String actualResult =
                calculatorService.executeOperation(number1,
                        number2, OperationTypeEnum.SUM);



        //final double expectedResult = Double.parseDouble("5");
        final String expectedResult = "The result of adding 2 plus 3  is 5.0";

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldCalculateSubtractionWhenRequested() {
        // Given
        BigDecimal number1 = new BigDecimal("5");
        BigDecimal number2 = new BigDecimal("10");


        // When
        final String actualResult =
                calculatorService.executeOperation(number1,
                        number2, OperationTypeEnum.SUBTRACTION);

        // Then
        final String expectedResult = "The result of subtracting  5 minus 10  is -5.0";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
