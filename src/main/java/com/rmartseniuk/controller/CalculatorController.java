package com.rmartseniuk.controller;

import com.rmartseniuk.number.Number;
import com.rmartseniuk.service.VisitorBasedCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
@RequiredArgsConstructor
public class CalculatorController {

    private final VisitorBasedCalculator calculator;

    @PostMapping("/calculate")
    public String calculate(@RequestBody String expression) {
        Number result = calculator.calculate(expression);
        return result.getValue();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String get() {
        return "1";
    }

}
