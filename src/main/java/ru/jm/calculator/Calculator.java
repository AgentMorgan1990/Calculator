package ru.jm.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ru.jm.calculator.RomanNumbers.ConvertorToRomanNumerals;
import ru.jm.calculator.RomanNumbers.InspectorRomanNumerals;
import ru.jm.calculator.RomanNumbers.RomanNumeral;
import ru.jm.calculator.Validator.ValidatorInputInformation;
import ru.jm.calculator.Validator.ValidatorResultOperation;
import ru.jm.calculator.Entity.OperationRequest;
import ru.jm.calculator.Entity.TypeOfNumbers;


public class Calculator {
    ValidatorInputInformation validatorInputInformation = new ValidatorInputInformation();
    RegistrarOperationRequest registrarOperationRequest = new RegistrarOperationRequest();
    StarterOperation starterOperation = new StarterOperation();

    String firstArgument;
    String secondArgument;
    String result;
    TypeOfNumbers typeOfNumbers;

    void start() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            String[] words = name.split(" ");
            if (validatorInputInformation.validate(words)) {
                if (InspectorRomanNumerals.checkRomanNumber(words[0]) && InspectorRomanNumerals.checkRomanNumber(words[2])) {
                    typeOfNumbers = TypeOfNumbers.ROMAN;
                    firstArgument = ConvertorToRomanNumerals.convert(words[0]);
                    secondArgument = ConvertorToRomanNumerals.convert(words[2]);
                } else {
                    typeOfNumbers = TypeOfNumbers.ARABIC;
                    firstArgument = words[0];
                    secondArgument = words[2];
                }

                OperationRequest operationRequest = registrarOperationRequest.register(words[1], firstArgument, secondArgument, typeOfNumbers);

                operationRequest.setResult(starterOperation.startOperation(operationRequest));
                if (operationRequest.getTypeOfNumbers().equals(TypeOfNumbers.ROMAN)) {
                    if (ValidatorResultOperation.validate(operationRequest.getResult())) {
                        result = RomanNumeral.arabicToRoman(operationRequest.getResult());
                        System.out.println(result);
                    }
                } else if (operationRequest.getTypeOfNumbers().equals(TypeOfNumbers.ARABIC)) {
                    System.out.println(operationRequest.getResult());
                }
            }
        } catch (IOException e) {
            System.out.println("Неверный формат ввода");
            e.printStackTrace();
        }
    }
}

