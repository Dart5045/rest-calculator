package com.sanitas.calculator.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class CalculatorController {
    //To do, call service instance.

    @GetMapping(value="/calculate")
    public ResponseEntity<String> calculate(
            //To do, add params

    )
    {
        log.debug("It works");
        //To do, call service method to calculate
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
