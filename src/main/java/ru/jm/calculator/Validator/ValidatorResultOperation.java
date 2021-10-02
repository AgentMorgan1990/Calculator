package ru.jm.calculator.Validator;

public class ValidatorResultOperation {
    public static boolean validate(int result) {
        boolean check = false;
        if (result < 1) {
            check = false;
            System.out.println("Результат операций над римскими цифрами не может быть отрицательным");
        } else {
            check = true;
        }
        return check;
    }
}
