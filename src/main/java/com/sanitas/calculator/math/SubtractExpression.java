package com.sanitas.calculator.math;

import java.math.BigDecimal;

public class SubtractExpression extends SimpleCalculator {

    public SubtractExpression(BigDecimal number1, BigDecimal number2) {
        super(number1,number2);
    }

    @Override
    public void evaluate() {
        this.result = this.number1.subtract(this.number2).doubleValue();
    }


    @Override
    public String display() {
        return "The result of subtracting  "+this.number1+" minus "+ this.number2+"  is "+this.result;
    }
}
