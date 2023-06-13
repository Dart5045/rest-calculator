package com.sanitas.calculator.math;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class AddExpression extends  SimpleCalculator{
    public  AddExpression(BigDecimal number1, BigDecimal number2) {
        super(number1,number2);
    }

    @Override
    public void evaluate() {
        this.result = this.number1.add(this.number2).doubleValue();
    }

    @Override
    public String display() {
        return "The result of adding "+this.number1+" plus "+ this.number2+"  is "+this.result;
    }
}
