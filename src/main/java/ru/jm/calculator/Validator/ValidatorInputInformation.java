package ru.jm.calculator.Validator;

import ru.jm.calculator.RomanNumbers.ConvertorToRomanNumerals;
import ru.jm.calculator.RomanNumbers.InspectorRomanNumerals;

public class ValidatorInputInformation {


    public boolean validate(String[] str) {
        boolean check = false;
        if ((checkingForIntegers(str[0], str[2])) && (checkingTypeOfOperation(str[1])) && checkingArrayLength(str) && checkingSameFormatOfNumbers(str[0], str[2]) && checkingValueOfNumbers(str[0], str[2])) {
            check = true;
        }
        return check;
    }


    //Проверка на целые числа
    private boolean checkingForIntegers(String first, String second) {
        boolean check = false;
        if (first.contains(".") || first.contains(",") || second.contains(".") || second.contains(",")) {
            System.out.println("Необходимо вводить только целые числа");
            check = false;
        } else {
            check = true;}
        return check;
    }

    //Проверка на поддерживаемые типы операций
    private boolean checkingTypeOfOperation(String type) {
        boolean check = false;
        if (type.equals("+") || type.equals("-") || type.equals("*") || type.equals("/")) {
            check = true;
        } else {
            check = false;
            System.out.println("Введен неверный тип операции, необходимо вводить только +,-,*,/");
        }
        return check;
    }

    //Проверка на количество введеных аргументов
    private boolean checkingArrayLength(String[] str) {
        boolean check = false;
        if (str.length > 3) {
            check = false;
            System.out.println("Введено слишком много аргументов");
        } else {
            check = true;
        }
        return check;
    }

    //Проверка не введены разные форматы чисел
    private boolean checkingSameFormatOfNumbers(String number_1, String number_2) {
        boolean check = false;
        if ((InspectorRomanNumerals.checkRomanNumber(number_1) && InspectorRomanNumerals.checkRomanNumber(number_2)) || (checkingStringToInt(number_1) && checkingStringToInt(number_2))) {
            check = true;
        } else {
            System.out.println("Нельзя вводить в аргументы цифры разных форматов");
            check = false;
        }
        return check;
    }

    //Проверка на возможность переконвертировать строку в число
    private boolean checkingStringToInt(String number) {
        boolean check = false;
        int number_1;
        try {
            number_1 = Integer.parseInt(number);
            check = true;
        } catch (Exception e) {
            check = false;
        }
        return check;
    }

    //Проверка находится ли число в необходимом диапазоне
    private boolean checkingValueOfNumbers(String number_1, String number_2) {
        boolean check = false;
        int numberOne;
        int numberTwo;
        if (InspectorRomanNumerals.checkRomanNumber(number_1) && InspectorRomanNumerals.checkRomanNumber(number_2)) {
            numberOne = Integer.parseInt(ConvertorToRomanNumerals.convert(number_1));
            numberTwo = Integer.parseInt(ConvertorToRomanNumerals.convert(number_2));
        } else {
            numberOne = Integer.parseInt(number_1);
            numberTwo = Integer.parseInt(number_2);
        }
        if ((numberOne > 0) && (numberOne < 11) && (numberTwo > 0) && (numberTwo < 11)) {
            check = true;
        } else {
            check = false;
            System.out.println("Вводимы числа должны быть в диапазоне от 1 до 10");
        }
        return check;
    }
}
