package com.rmartseniuk.number;

import com.rmartseniuk.utils.NumberUtils;
import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

public abstract class BaseNumber extends Number {

    protected final String value;
    protected final int radix;

    public BaseNumber(String value, int radix) {
        super(value);
        this.value = value;
        this.radix = radix;
    }

    private Apfloat createCurrentApfloat(String value) {
        String digit = NumberUtils.getDigit(value);
        return new Apfloat(digit, 23L, radix);
    }

    private Apfloat createOperandApfloat(String value) {
        String digit = NumberUtils.getDigit(value);
        int radix = NumberUtils.getRadix(value);
        return new Apfloat(digit, 23L, radix);
    }

    @Override
    public Number add(Number n) {
        Apfloat current = createCurrentApfloat(this.getValue());
        Apfloat operand = createOperandApfloat(n.getValue()).toRadix(radix);

        Apfloat result = current.add(operand);

        return createNumber(result.toString(true));
    }

    @Override
    public Number subtract(Number n) {
        Apfloat current = createCurrentApfloat(this.getValue());
        Apfloat operand = createOperandApfloat(n.getValue()).toRadix(radix);

        Apfloat result = current.subtract(operand);

        return createNumber(result.toString(true));
    }

    @Override
    public Number multiply(Number n) {
        Apfloat current = createCurrentApfloat(this.getValue());
        Apfloat operand = createOperandApfloat(n.getValue()).toRadix(radix);

        Apfloat result = current.multiply(operand);

        return createNumber(result.toString(true));
    }

    @Override
    public Number divide(Number n) {
        Apfloat current = createCurrentApfloat(this.getValue());
        Apfloat operand = createOperandApfloat(n.getValue()).toRadix(radix);

        Apfloat result = current.divide(operand);
        return createNumber(result.toString(true));
    }

    @Override
    public Number pow(Number n) {
        Apfloat current = createCurrentApfloat(this.getValue());
        Apfloat result = ApfloatMath.pow(current, Long.parseLong(n.getValue()));
        return createNumber(result.toString(true));
    }

    @Override
    public Number convert(int radix) {
        if (radix == this.radix) {
            return this;
        }
        Apfloat current = createCurrentApfloat(this.getValue());
        Apfloat converted = current.toRadix(radix);
        return NumberUtils.parseRadix(radix, converted.toString(true));
    }

    protected abstract Number createNumber(String value);
}

