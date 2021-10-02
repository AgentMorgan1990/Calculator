package ru.jm.calculator;

import ru.jm.calculator.Entity.OperationRequest;
import ru.jm.calculator.Operator.OperationType;
import ru.jm.calculator.Entity.TypeOfNumbers;

public class RegistrarOperationRequest {

    OperationRequest register(String type, String firstNumber, String secondNumber,
                              TypeOfNumbers typeOfNumbers) {
        OperationType operationType=null;
        int firstOperand = Integer.parseInt(firstNumber);
        int secondOperand = Integer.parseInt(secondNumber);
        switch (type) {
            case "+":
                operationType = OperationType.ADDITION;
                break;
            case "-":
                operationType = OperationType.SUBTRACTION;
                break;
            case "*":
                operationType = OperationType.MULTIPLICATION;
                break;
            case "/":
                operationType = OperationType.DIVISION;
                break;
            default:
                break;
        }
        OperationRequest operationRequest = new OperationRequest(operationType,firstOperand,secondOperand,
                typeOfNumbers,0);
        return operationRequest;
    }
}