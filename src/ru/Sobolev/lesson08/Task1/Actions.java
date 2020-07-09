package ru.Sobolev.lesson08.Task1;

public class Actions {

    static double firstNumber = Calculator.getNumberOne(), secondNumber = Calculator.getNumberTwo(), answer = 0;
    //В данном случае не проще было бы сделать три переменных: a, b, c?
    // Код был бы более читабелен и краток

    static void Addition() {
        //Сложение
        answer = firstNumber + secondNumber;
    }

    static void Division() {
        //Деление
        answer = firstNumber / secondNumber;
    }

    static void Subtraction() {
        //Вычитание
        answer = firstNumber - secondNumber;
    }

    static void Multiplication() {
        //Умножение
        answer = firstNumber * secondNumber;
    }

    static void Percent() {
        //Процент от числа
        answer = 100 * secondNumber / firstNumber;
    }

    public static double getAnswer() {
        return answer;
    }
}
