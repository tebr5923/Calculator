package com.tebr5923.parser;

import com.tebr5923.calculator.Storage;

public interface Parser {
    Storage stringToStorage(String input);

    String resultToString(int result);
}
