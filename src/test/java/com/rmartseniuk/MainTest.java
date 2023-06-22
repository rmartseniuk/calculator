package com.rmartseniuk;

import static org.assertj.core.api.Assertions.assertThat;

import com.rmartseniuk.service.Calculator;
import com.rmartseniuk.service.VisitorBasedCalculator;
import com.rmartseniuk.number.Number;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest {

    @ParameterizedTest
    @MethodSource("com.rmartseniuk.MathExample#mathExamples")
    void evaluateMathExpressions(String expression, Object expectedResult) {
        Calculator calculator = new VisitorBasedCalculator();
        Number result = calculator.calculate(expression);
        assertThat(result.getValue()).isEqualTo(expectedResult);
    }
}