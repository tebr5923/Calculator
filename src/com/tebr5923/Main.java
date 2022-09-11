package com.tebr5923;

import com.tebr5923.calculator.ArabianCalculator;
import com.tebr5923.calculator.Calculator;
import com.tebr5923.calculator.RomeCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            var input = scanner.nextLine();
            if (input.equals("q")){
                scanner.close();
                break;
            }
            System.out.println(calc(input));
        }
    }

    public static String calc(String input) {
        String result;
        if (Character.isDigit(input.charAt(0))) {
            Calculator calculator = new ArabianCalculator();
            result = calculator.calculate(input);
        } else {
            Calculator calculator = new RomeCalculator();
            result = calculator.calculate(input);
        }
        return result;
    }

}
