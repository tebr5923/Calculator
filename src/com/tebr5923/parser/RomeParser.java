package com.tebr5923.parser;

import com.tebr5923.exception.LineFormatException;

import java.util.regex.Pattern;

public class RomeParser extends AbstractParser {

    @Override
    protected int numberToInt(String rome) {
        try {
            return RomeNumbers.valueOf(rome).getArabianNumber();
        } catch (IllegalArgumentException e) {
            throw new LineFormatException("Wrong number format");
        }
    }

    @Override
    protected void checkInputInt(int number) {
        if (number > 10) {
            throw new NumberFormatException("Wrong number format");
        }
    }

    @Override
    protected boolean checkInputLine(String input) {
        return Pattern.matches("[IVX]{1,4}\\s[+\\-*/]\\s[IVX]{1,4}", input);
    }

    @Override
    protected String doResultToString(int result) {
        RomeNumbers[] r = RomeNumbers.values();
        return r[result - 1].name();
    }
}
