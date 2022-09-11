package com.tebr5923.parser;

import com.tebr5923.calculator.Operation;
import com.tebr5923.calculator.Storage;
import com.tebr5923.exception.LineFormatException;

abstract class AbstractParser implements Parser {
    @Override
    public Storage stringToStorage(String input) {
        if (!checkInputLine(input)) {
            throw new LineFormatException("Wrong line format");
        }
        var strings = input.split(" ");
        int first = numberToInt(strings[0]);
        int second = numberToInt(strings[2]);
        checkInputInt(first);
        checkInputInt(second);

        Operation operation = stringToOperation(strings[1]);
        return new Storage(first, second, operation);
    }

    @Override
    public String resultToString(int result) {
        return doResultToString(result);
    }

    protected abstract String doResultToString(int result);

    protected abstract boolean checkInputLine(String input);

    protected abstract int numberToInt(String number);

    protected abstract void checkInputInt(int number);

    private Operation stringToOperation(String stringOperation){
        Operation operation;
        if (stringOperation.equals("/")) {
            operation = Operation.DIV;
        } else if (stringOperation.equals("*")) {
            operation = Operation.MUL;
        } else if (stringOperation.equals("-")) {
            operation = Operation.SUB;
        } else {
            operation = Operation.ADD;
        }
        return operation;
    }
}
