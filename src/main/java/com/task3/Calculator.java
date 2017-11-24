package com.task3;
//3. Реализация простейшего калькулятора. Доступны четыре арифметических
//        действия: сложение (+), умножение (*), деление (/) и вычитание (-). На вход
//        программе подается строка вида [число][ариф. знак][число], на выходе результат
//        операции.
//        Например:
//        Input: 4+7
//        Output: 11

public class Calculator {

    public double factoryMethod(String string) throws CalculatorException {
        if (string.isEmpty()) throw new CalculatorException("empty string");
        String[] arr = string.split("[^0-9]");
        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);
        if (arr.length != 2) throw new CalculatorException("error input");
        double result = 0;
        if (string.contains("+")) {
            result = plus(a, b);
        } else if (string.contains("-")) {
            result = minus(a, b);
        } else if (string.contains("*")) {
            result = mult(a, b);
        } else if (string.contains("/")) {
            result = div(a, b);
        } else {
            System.out.println("Error");
        }
        return result;
    }

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero.");
        }
        return a / b;
    }

}
