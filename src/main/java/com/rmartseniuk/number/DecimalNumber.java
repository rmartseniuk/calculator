package com.rmartseniuk.number;

public class DecimalNumber extends BaseNumber {

    private static final int RADIX = 10;

    public DecimalNumber(String value) {
        super(value, RADIX);
    }

    @Override
    protected Number createNumber(String value) {
        return new DecimalNumber(value);
    }

}
