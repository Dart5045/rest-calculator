package com.sanitas.calculator.math;

import java.math.BigDecimal;

public abstract class SimpleCalculator {

    protected BigDecimal number1, number2;
    protected double result;

    protected SimpleCalculator(BigDecimal number1, BigDecimal number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract String display();

    public abstract void evaluate();
}
