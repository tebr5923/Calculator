package com.tebr5923.calculator;

import com.tebr5923.parser.RomeParser;

public class RomeCalculator extends AbstractCalculator {
    public RomeCalculator() {
        this.parser = new RomeParser();
    }

    @Override
    protected void checkResult(int result) {
        if (result < 0) {
            throw new NumberFormatException("Result must be positive");
        }
    }

}
