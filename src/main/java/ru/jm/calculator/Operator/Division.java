package ru.jm.calculator.Operator;

public class Division implements Operator {
    @Override
    public int execute(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
