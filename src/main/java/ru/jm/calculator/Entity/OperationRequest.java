package ru.jm.calculator.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.jm.calculator.Operator.OperationType;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OperationRequest {
    private OperationType operationType;
    private int firstOperand;
    private int secondOperand;
    private TypeOfNumbers typeOfNumbers;
    private int result;
}
