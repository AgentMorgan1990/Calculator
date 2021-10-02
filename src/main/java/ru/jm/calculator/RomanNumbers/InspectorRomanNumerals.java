package ru.jm.calculator.RomanNumbers;

public class InspectorRomanNumerals {
    public static boolean checkRomanNumber(String number) { //todo это можно улучшить
        boolean check = number.equals("I") || number.equals("II") || number.equals("III") || number.equals(
                "IV") || number.equals("V")|| number.equals("VI") || number.equals("VII") || number.equals("VIII")
                || number.equals("IX") || number.equals("X");
        return check;
    }
}
