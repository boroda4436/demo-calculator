package com.mate.calculator.controllers;

import com.mate.calculator.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping(value = "/calc")
    public Integer getResult(@RequestParam(value = "operation") String operation,
                             @RequestParam(value = "a") Integer a,
                             @RequestParam(value = "b") Integer b) {
        Calculator calculator = new Calculator();
        Integer result = calculator.getResult(operation, a, b);

        System.out.println("The " + operation + " between " + a + " and " + b
                + " is: " + result);
        return result;
    }
}
