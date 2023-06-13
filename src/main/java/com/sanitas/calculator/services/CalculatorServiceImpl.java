package com.sanitas.calculator.services;

import com.sanitas.calculator.utils.OperationTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Slf4j
@Service
public class CalculatorServiceImpl implements  CalculatorService{
    @Override
    public String executeOperation(BigDecimal number1, BigDecimal number2, OperationTypeEnum operator) {

        //To do, call exception if operator is empty

        //To do, create calculator object

        switch (operator) {
            case SUM:
                //To do : call sum calculator method
                break;
            case SUBTRACTION:
                //To do: call substraction method.
        }

        log.debug("Service works");
        return "Service called";
    }
}
