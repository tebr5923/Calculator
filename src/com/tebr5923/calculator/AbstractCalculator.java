package com.tebr5923.calculator;

import com.tebr5923.parser.Parser;

abstract class AbstractCalculator implements Calculator {
    protected Parser parser;

    @Override
    public String calculate(String input) {
        var storage = parser.stringToStorage(input);
        var result =doCalc(storage);
        checkResult(result);
        return parser.resultToString(result);
    }

    private int doCalc(Storage storage){
        var operation = storage.getOperation();
        var firstNumber = storage.getFirstNumber();
        var secondNumber = storage.getSecondNumber();
        int result;

        if (operation == Operation.DIV) {
            result = firstNumber / secondNumber;
        } else if (operation == Operation.MUL) {
            result = firstNumber * secondNumber;
        } else if (operation == Operation.ADD) {
            result = firstNumber + secondNumber;
        } else if (operation == Operation.SUB) {
            result = firstNumber - secondNumber;
        } else {
            result = -50;
        }
        return result;
    }

    protected abstract void checkResult(int result) ;
}
