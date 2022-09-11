package com.tebr5923.calculator;

import com.tebr5923.parser.ArabianParser;

public class ArabianCalculator extends AbstractCalculator {

    public ArabianCalculator() {
        this.parser = new ArabianParser();
    }

    @Override
    protected void checkResult(int result) {
    // not need check in ArabianCalculator
    }

}
