package com.rmartseniuk.number;

import lombok.Getter;

@Getter
public class BinaryNumber extends BaseNumber {

    private static final int RADIX = 2;

    public BinaryNumber(String value) {
        super(value, RADIX);
    }

    @Override
    protected Number createNumber(String value) {
        return new BinaryNumber(value);
    }

}
