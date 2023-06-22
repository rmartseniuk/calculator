package com.rmartseniuk;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class MathExample {
    static Stream<Arguments> mathExamples() {
        return Stream.of(
                // decimal expressions
                Arguments.of("1 + 2", "3"),
                Arguments.of("1 / 2", "0.5"),
                Arguments.of("-1 + -2", "-3"),
                Arguments.of("1 / 4", "0.25"),
                Arguments.of("1/4 + 1/4", "0.5"),
                Arguments.of("4 / 1 * 2", "8"),
//                Arguments.of("4 / 0", Double.POSITIVE_INFINITY),
//                Arguments.of("-4 / 0", Double.NEGATIVE_INFINITY),
                Arguments.of("2 * 3", "6"),
                Arguments.of("-2 * 3", "-6"),
                Arguments.of("2 ^ 3", "8"),
                Arguments.of("(2 + 3) * 2 - 1", "9"),
                Arguments.of("1 - 2 * 3 + 4", "-1"),
                Arguments.of("1 + 2 * 3 - 4", "3"),

                // multiline and in parentheses expressions
                Arguments.of("a=4\nb=a^2\nc=a+b*(a-1)\na+b+c", "72"),
                Arguments.of("((51+28)*56)-7=", "4417"),

                // binary expressions
                Arguments.of("111.1<2> + 0.1011<2>", "1000.0011"),
                Arguments.of("111.1<2>+8", "1111.1"),

                // convert expressions
                Arguments.of("convert(111.1<2>, 10)", "7.5"),
                Arguments.of("convert(0.1011<2>, 10)", "0.6875"),
                Arguments.of("convert(0.1011<2>, 8)", "0.54<8>"),
                Arguments.of("convert(0.1011<2>, 10) + convert(0.1011<2>, 8)", "1.375"),
                Arguments.of("convert(2124.3<16>, 10) + convert(2124.5<16>, 10)", "16968.5"),
                Arguments.of("convert(convert(0.1011<2>, 16), 8)", "0.54<8>"),

                // expressions with mantissa
                Arguments.of("212.43e+1<8> + 212.45e+1<8>", "4251"),
                Arguments.of("212.43E+1 + 212.45E+1", "4248.8"),
                Arguments.of("212.43e+1 + 212.45e+1", "4248.8"),
                Arguments.of("212.43E-1 + 212.45E-1", "42.488"),
                Arguments.of("212.43E1 + 212.45E1", "4248.8"),
                Arguments.of("212.43e+1<8> + 212.45e+1<8>", "4251"),

                Arguments.of("21240<16> / 2124<16>", "10"),
                Arguments.of("212.43M+1<16> + 212.45M+1<16>", "5b23.b"),
                Arguments.of("212.43m+1<16> + 212.45m+1<16>", "5b23.b"),
                Arguments.of("2124.3<16> + 2124.5<16>", "4248.8"),

                // Expressions targeting the negation operator
                Arguments.of("3-4", "-1"),
                Arguments.of("3--4", "7"),
                Arguments.of("-(1+2)", "-3"),
                Arguments.of("0101<2>+0101<2>", "10")
        );
    }
}
