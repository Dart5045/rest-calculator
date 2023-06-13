package com.sanitas.calculator.controllers;

import com.sanitas.calculator.config.TracerSingleton;
import com.sanitas.calculator.services.CalculatorServiceImpl;
import com.sanitas.calculator.utils.OperationTypeEnum;
import io.corp.calculator.TracerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class CalculatorController {
    @Autowired
    CalculatorServiceImpl  calculatorService;

    @Autowired
    TracerSingleton tracerSingleton;

    /**
     *
     * @param number1
     * @param number2
     * @param operator
     * @return
     * @throws IllegalArgumentException
     */
    @GetMapping(value="/calculate")
    public ResponseEntity<String> calculate(
            @RequestParam(name = "number1") BigDecimal number1,
            @RequestParam(name = "number2") BigDecimal number2,
            @RequestParam(name = "operator")OperationTypeEnum operator
            )
    {
        if(null == number1 || null == number2 || null == operator) {
            throw new IllegalArgumentException("{\"error\":\"At least one parameter is invalid or not supplied\"}");
        }

        String res = calculatorService.executeOperation(number1, number2, operator);
        tracerSingleton.trace(res);

        return new ResponseEntity<String>(res ,HttpStatus.OK);
    }
}
