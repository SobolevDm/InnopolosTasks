package ru.Sobolev.old.lesson08.Task1;

import ru.Sobolev.lesson08.Task1.Calculator;

public class Actions {

    public static double firstNumber = Calculator.getNumberOne();
    public static double secondNumber = Calculator.getNumberTwo();
    static double answer = 0;
    //В данном случае не проще было бы сделать три переменных: a, b, c?
    // Код был бы более читабелен и краток

    public static void Addition() {
        //Сложение
        answer = firstNumber + secondNumber;
    }

    public static void Division() {
        //Деление
        answer = firstNumber / secondNumber;
    }

    public static void Subtraction() {
        //Вычитание
        answer = firstNumber - secondNumber;
    }

    public static void Multiplication() {
        //Умножение
        answer = firstNumber * secondNumber;
    }

    public static void Percent() {
        //Процент от числа
        answer = 100 * secondNumber / firstNumber;
    }

    public static double getAnswer() {
        return answer;
    }
}
