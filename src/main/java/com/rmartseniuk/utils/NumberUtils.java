package com.rmartseniuk.utils;

import com.rmartseniuk.number.BinaryNumber;
import com.rmartseniuk.number.DecimalNumber;
import com.rmartseniuk.number.HexNumber;
import com.rmartseniuk.number.Number;
import com.rmartseniuk.number.OctalNumber;
import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

public class NumberUtils {

    public static Number parseRadix(int radix, String number) {
        switch (radix) {
            case 2:
                return new BinaryNumber(number);
            case 8:
                return new OctalNumber(number);
            case 10:
                return new DecimalNumber(number);
            case 16:
                return new HexNumber(number);
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String parseHexMantissa(String digit) {
        if (!(digit.contains("m") || digit.contains("M"))) {
            return digit;
        }

        String[] arr = digit.split("[m | M]", 2);
        String power = arr[1].substring(0, arr[1].indexOf('<'));
        Apfloat pow = ApfloatMath.pow(new Apfloat("16", 23, 16), new Apfloat(power, 23, 16));
        Apfloat result = new Apfloat(arr[0], 23, 16).multiply(pow);

        return result.toString(true) + "<16>";
    }

    public static String getDigit(String text) {
        if (text.indexOf('<') != -1) {
            return text.substring(0, text.indexOf('<'));
        } else {
            return text;
        }
    }

    public static int getRadix(String text) {
        if (text.indexOf('<') != -1) {
            return Integer.parseInt(text.substring(text.indexOf('<') + 1, text.indexOf('>')));
        } else {
            return 10;
        }
    }

}
