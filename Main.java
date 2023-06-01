package ru.babushkina.calculator.itgirlschool.itgirlcalculatorproject;

public class Main {
    public static void main(String[] args) {
        String num1 = args[0];
        String num2 = args[1];

        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);


        int sumResult = Calculator.sum(x, y);
        ConsolePrinter.printResult("Summa: ", " + ", sumResult, x, y);

        int multiplResult = Calculator.multiplication(x, y);
        ConsolePrinter.printResult("Multiplication: ", " * ", multiplResult, x, y);

        int substrResult = Calculator.subtract(x, y);
        ConsolePrinter.printResult("Substraction: ", " - ", substrResult, x, y);

    }
}
