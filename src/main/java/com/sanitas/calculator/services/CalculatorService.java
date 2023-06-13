package com.sanitas.calculator.services;

import com.sanitas.calculator.utils.OperationTypeEnum;

import java.math.BigDecimal;

public interface CalculatorService {
    public String executeOperation(BigDecimal number1, BigDecimal  number2, OperationTypeEnum operator);
}
