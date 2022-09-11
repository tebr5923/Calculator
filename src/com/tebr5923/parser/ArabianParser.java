package com.tebr5923.parser;

import java.util.regex.Pattern;

public class ArabianParser extends AbstractParser {

    @Override
    protected String doResultToString(int result) {
        return Integer.toString(result);
    }

    @Override
    protected boolean checkInputLine(String input) {
        return Pattern.matches("^\\d{1,2}\\s[+\\-*/]\\s\\d{1,2}", input);
    }

    @Override
    protected int numberToInt(String number){
        return Integer.parseInt(number);
    }

    @Override
    protected void checkInputInt(int number){
        if (number > 10 || number < 1 ) {
            throw new NumberFormatException("Wrong number format");
        }
    }

}
