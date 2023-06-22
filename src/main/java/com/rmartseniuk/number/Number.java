package com.rmartseniuk.number;

import lombok.Data;

@Data
public abstract class Number {

    private String value;

    public Number(String value) {
        this.value = value;
    }

    public abstract Number add(Number n);

    public abstract Number subtract(Number n);

    public abstract Number multiply(Number n);

    public abstract Number divide(Number n);

    public abstract Number pow(Number n);

    public abstract Number convert(int radix);

}
