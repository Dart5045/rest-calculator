package com.sanitas.calculator.controllers;

import com.sanitas.calculator.services.CalculatorService;
import com.sanitas.calculator.services.CalculatorServiceImpl;
import com.sanitas.calculator.utils.OperationTypeEnum;
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


    @GetMapping(value="/calculate")
    public ResponseEntity<String> calculate(
            @RequestParam(name = "number1") BigDecimal number1,
            @RequestParam(name = "number2") BigDecimal number2,
            @RequestParam(name = "operator")OperationTypeEnum operator
            )
    {
        String res = calculatorService.executeOperation(number1, number2, operator);
        return new ResponseEntity<String>(res ,HttpStatus.OK);
    }
}
