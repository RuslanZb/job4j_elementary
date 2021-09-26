package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumTwoOperation(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumFourOperation(double first, double second) {
        return sub(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равен: " + sumTwoOperation(10, 20));
        System.out.println("Результат расчета 3 равен: " + sumFourOperation(10, 20));
    }
}
