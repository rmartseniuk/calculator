package com.rmartseniuk.number;

public class HexNumber extends BaseNumber {

    private static final int RADIX = 16;

    public HexNumber(String value) {
        super(value, RADIX);
    }

    @Override
    protected Number createNumber(String value) {
        return new HexNumber(value);
    }

}
