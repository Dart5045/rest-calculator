package com.sanitas.calculator.controllers;

import com.sanitas.calculator.services.CalculatorServiceImpl;
import com.sanitas.calculator.utils.OperationTypeEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTest {

    @Mock
    private CalculatorServiceImpl calculatorService;

    @Autowired
    private CalculatorController calculatorController;

    @Autowired
    private MockMvc mvc;
    /*
    @Test
    public void subtract() {
        // Given
        BigDecimal number1 = new BigDecimal(10);
        BigDecimal number2 = new BigDecimal(20);
        double expectedResult = -10;

        // When
        MockHttpServletResponse response = given()
                .queryParam("number1", number1)
                .queryParam("number2", number2)
                .queryParam("operator", OperationTypeEnum.SUM)
                .expect().statusCode(200)
                .when()
                .ge("/calculate");


        // Then
        double actualResult = response.then().extract().body().htmlPath().getDouble("body");
        Assertions.assertEquals(expectedResult, actualResult);

    }
    */
}
