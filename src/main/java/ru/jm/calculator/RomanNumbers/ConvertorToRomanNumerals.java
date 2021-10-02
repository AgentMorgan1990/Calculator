package ru.jm.calculator.RomanNumbers;

public class ConvertorToRomanNumerals {


    public static String convert(String str) {
        String romanNumber;
        romanNumber = String.valueOf(RomanNumeral.romanToArabic(str));
        return romanNumber;
    }
}
