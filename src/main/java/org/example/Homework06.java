package org.example;

import java.util.Scanner;

public class Homework06 {
    public static final Scanner scanner = new Scanner(System.in);

    static void Task1() {
/** Task_1
 * Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter);
 * Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран;
 * Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter);
 * Если в строке чётное число букв, строка удваивается, если нечётное - утраивается;
 * Программа выводит слова на экран
 * */

        System.out.println("Введите значения в консоль");
        String string = scanner.nextLine();
        String sUpper = string.toUpperCase();
        while (!string.isEmpty()) {
            if (string.length() % 2 == 0) {
                System.out.println("Сработал блок четных слов " + sUpper + " " + sUpper);
            }
            sUpper = string.toUpperCase();
            if (string.length() % 2 != 0) {
                System.out.println("Сработал блок нечетных слов " + sUpper + " " + sUpper + " " + sUpper);
            }
            string = scanner.nextLine();
            sUpper = string.toUpperCase();
        }
    }

    static void Task2() {
/** Task_2
 * Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину
 * */
        String[] mas = new String[5];
        System.out.println("Введи " + mas.length + " элементов с клавиатуры");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextLine();
            String minLine = mas[i];
            String maxLine = mas[i];
            while (!mas[i].isEmpty()) {
                if (minLine.length() > mas[i].length()) {
                    minLine = mas[i];
                } else if (maxLine.length() < mas[i].length()) {
                    maxLine = mas[i];
                }
                mas[i] = scanner.nextLine();
            }
            if (minLine == maxLine) {
                System.out.println("Введена одна строка или строки одинаковы " + minLine);
            } else {
                System.out.println("Самая короткая строка " + minLine);
                System.out.println("Самая длинная строка строка " + maxLine);
            }
        }
    }

    static void Task3() {
/**
 * Task_3
 * 1. Создать массив на 10 строк;
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив;
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки;
 * */
        String[] mas = new String[10];
        for (int i = 0; i < 8; i++) {
            mas[i] = scanner.nextLine();
        }
        for (int i = 8; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }

    static void Task4() {
/** Task_4
 * 1. Создать массив на 10 строк;
 * 2. Создать массив на 10 чисел;
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк;
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел;
 */
        String[] stringsMas = new String[10];
        System.out.println("Введи " + stringsMas.length + " элементов с клавиатуры");
        for (int i = 0; i < stringsMas.length; i++) {
            stringsMas[i] = scanner.nextLine();
        }
        for (String i : stringsMas) {
            System.out.println("Длина слова [" + i + "]" + " - равна: " + i.length());
        }
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++){
            intArr[i] = stringsMas[i].length();
            System.out.println("Длина элемента - " + i + " равна - " + intArr[i]);
        }
    }

    static void Task5() {
/**
 * Task_5
 * 1. Считать 6 строк и заполнить ими массив strings.
 * 2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 */
/** Блок для работы сканера и заполнения массива данными с клавиатуры*/
        String[] Arr1 = new String[6];
        System.out.println("Введи " + Arr1.length + " элементов с клавиатуры");
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i] = scanner.nextLine();
        }
        /** Цикл, который пройдет по всем элементам массива Arr1;
         * введем дополнительную переменную которая равна массиву, что бы разграничить их при сравнении;
         * Далее когда в первом цикле i=0, тогда во втором j=1 и внутри второго цикла происходит сравнение первого элемента
         * до тех пор, пока длина массива не исчерпается;
         * В следующей итерации цикла i=1, а j=2 и так же происходит сравнение через метод equals;
         * */
        for (int i = 0; i < Arr1.length; i++) {
            String Arr2 = Arr1[i];
            for (int j = i + 1; j < Arr1.length; j++) {
                if (Arr2 == null)
                    break;
                if (Arr2.equals(Arr1[j])) {
                    Arr1[i] = null;
                    Arr1[j] = null;
                }
            }
        }
        for (String string : Arr1) System.out.print(string + ", ");
    }
}