package ru.jm.calculator.Operator;

public class Subtraction implements Operator{
    @Override
    public int execute(int firstOperand, int secondOperand) {
        return firstOperand-secondOperand;
    }
}
