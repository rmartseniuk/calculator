package com.rmartseniuk.number;

public class OctalNumber extends BaseNumber {

    private static final int RADIX = 8;

    public OctalNumber(String value) {
        super(value, RADIX);
    }

    @Override
    protected Number createNumber(String value) {
        return new OctalNumber(value);
    }

}
