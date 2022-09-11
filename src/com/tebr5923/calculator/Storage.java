package com.tebr5923.calculator;

import java.util.Objects;

public class Storage {
    private int firstNumber;
    private int secondNumber;
    private Operation operation;

    public Storage(int firstNumber, int secondNumber, Operation operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return firstNumber == storage.firstNumber && secondNumber == storage.secondNumber && operation == storage.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber, operation);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", operation=" + operation +
                '}';
    }
}
