package org.example;
/** 1 - Добавить методы в телефонную книгу.
 *  2 - Задачи*/

public class Homework07 {
    /** Task01 Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб. */
    public static int Task1(int number, int exponentiation) {
        int result = 1;
        for (int i = 1; i <= exponentiation; i++) {
            result = result * number;
        }
        return result;
    }
    /** Task02 Напишите метод, который бы возвращал в консоль: true, если число больше 5 и false, если число меньше 5 */
    public static boolean Task2(int num) {
        if (num > 5) {
            return true;
        } else {
            return false;
        }
    }
    /** Task03 Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3 */
    public static int Task3(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    /**Task04 Необходимо написать метод, который бы возводил число в степень. И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль */
    public static int Task4(int number, int exponentiation) {
        int result = 1;
        for (int i = 1; i <= exponentiation; i++) {
            result = result * number;
        }
        System.out.println("Результат возведения в степень " + result);
        return number + exponentiation;
    }
    /**Task05 Условие задачи:
     * Необходимо написать простой консольный калькулятор на Java.
     * Метод int getInt() - должен считывать с консоли целое число и возвращать его;
     * Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
     * Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
     * Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.
     */

}





