package ru.babushkina.calculator.itgirlschool.itgirlcalculatorproject;

public class ConsolePrinter {
    public static void printResult(String operation, String sign, int result, int x, int y) {
        System.out.println(operation + " " + x + sign + y + " = " + result);
    }
}
