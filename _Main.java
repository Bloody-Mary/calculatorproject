package ru.babushkina.calculator;

public class _Main {
    public static void main(String[] args) {
        String num1 = args[0];
        String num2 = args[1];

        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);

        int sumResult = Calculator.calculateSum(x, y);
        ConsolePrinter.printResult("Sum: ", " + ", sumResult, x, y);

        int multiplResult = Calculator.calculateMultiplication(x, y);
        ConsolePrinter.printResult("Multiplication: ", " * ", multiplResult, x, y);

        int substrResult = Calculator.calculateSubtract(x, y);
        ConsolePrinter.printResult("Substraction: ", " - ", substrResult, x, y);

    }
}
