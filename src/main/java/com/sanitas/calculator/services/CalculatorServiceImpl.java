package com.sanitas.calculator.services;

import com.sanitas.calculator.math.AddExpression;
import com.sanitas.calculator.math.SimpleCalculator;
import com.sanitas.calculator.math.SubtractExpression;
import com.sanitas.calculator.utils.OperationTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Slf4j
@Service
public class CalculatorServiceImpl implements  CalculatorService{
    @Override
    public String executeOperation(BigDecimal number1, BigDecimal number2, OperationTypeEnum operator) {


        if(operator == null) {
            throw new RuntimeException("Operator is missing" );
        }
        SimpleCalculator simpleCalculator;

        switch (operator) {
            case SUM:
                simpleCalculator = new AddExpression(number1,number2);
                break;
            case SUBTRACTION:
                simpleCalculator = new SubtractExpression(number1,number2);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        simpleCalculator.evaluate();
        return  simpleCalculator.display();
    }
}
