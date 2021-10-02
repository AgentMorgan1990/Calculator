package ru.jm.calculator;

import ru.jm.calculator.Entity.OperationRequest;
import ru.jm.calculator.Operator.Addition;
import ru.jm.calculator.Operator.Division;
import ru.jm.calculator.Operator.Multiplication;
import ru.jm.calculator.Operator.Subtraction;

public class StarterOperation {
    public int startOperation(OperationRequest request) {
        int result = 0;
        switch (request.getOperationType()) {
            case ADDITION:
                Addition addition = new Addition();
                result = addition.execute(request.getFirstOperand(), request.getSecondOperand());
                break;
            case SUBTRACTION:
                Subtraction subtraction = new Subtraction();
                result = subtraction.execute(request.getFirstOperand(), request.getSecondOperand());
                break;
            case MULTIPLICATION:
                Multiplication multiplication = new Multiplication();
                result = multiplication.execute(request.getFirstOperand(), request.getSecondOperand());
                break;
            case DIVISION:
                Division division = new Division();
                result = division.execute(request.getFirstOperand(), request.getSecondOperand());
                break;
            default:
                break;
        }
        return result;
    }
}
