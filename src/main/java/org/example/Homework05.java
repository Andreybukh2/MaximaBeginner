package org.example;

import java.util.Scanner;


/** Task_01
 *
 */
public class Homework05 {
    public static final Scanner scanner = new Scanner(System.in);
    private static void foriLogic (int[] mas) {
        System.out.println("Введи " + mas.length + " чисел с клавиатуры - ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введи элемент №" + i);
            mas[i] = scanner.nextInt();
        }
    }
    static void Task1 () {
        int mas[] = new int[10];                             // Создаём массив int размером в 10;
        System.out.println("Введи " + mas.length + " чисел с клавиатуры - "); // Техническое поле для понимания, что можно вводить данные;
        for (int i = 0; i < 8; i++) {                    // Цикл для ограничения ввода элементов по условию задачи их 8;
            System.out.println("Введи элемент №" + i);
            mas[i] = scanner.nextInt();                  // Метод nextInt считает числа с клавиатуры, заполняя массив по имени mas элементами [i];
        }
        System.out.print ("Вывели элементы в обратном порядке: ");
        for (int i = mas.length - 1; i >= 0; i--) {
            // От i равной длине массива вычитаем -1 или -2 или -3 (В зависимости от условия задачи (в нашем случае нужен вывод 10 элементов поэтому -1);
            // Поэтому не выводи нули, i-- (потому что необходим обратный порядок);
            System.out.println (" " + mas[i]);               // Выводим на экран, полученный массив с пробелами.
        }
        System.out.println();
    }
    /** Task_02
     * 1.1. Создай массив на 10 чисел
     * 1.2. Считай с консоли 10 чисел и заполни ими массив
     * 2. Найти максимальное число из элементов массива
     */
    static void Task2 () {
        int mas [] = new int[10];
        System.out.println("Input elements in array - ");
        foriLogic(mas);
        int max = mas[0];
        for (int j : mas) {
            if(j > max) max = j;
        }
        System.out.println("Max number = " + max);
    }
    /** Task_04
     * 1. Создать массив на 10 чисел.
     * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
     * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
     * */
    static void Task4 () {
        int mas [] = new int[10];
        foriLogic(mas);
        System.out.print ("Вывели элементы в обратном порядке: ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println (" " + mas[i]);
        }
        System.out.println();
    }
    /** 5 Task
     1. Создать массив на 20 чисел.
     2. Ввести в него значения с клавиатуры.
     3. Создать два массива на 10 чисел каждый.
     4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
     5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
     */
    static void Task5 () {
        int mas [] = new int [20];
        int mas2 [] = new int [10];
        int mas3 [] = new int [10];

        foriLogic(mas);
        System.arraycopy(mas, 0, mas2, 0, 10);
        System.arraycopy(mas, 10, mas3, 0, 10);

        for (int i = 0; i < mas3.length; i++) {
            System.out.println(mas3[i]);
        }
    }
    /** 6 Task
     Создать массив на 20 чисел.
     Заполнить его числами с клавиатуры.
     Найти максимальное и минимальное числа в массиве.
     Вывести на экран максимальное и минимальное числа через пробел.
     */
    static void Task6 () {
        int mas [] = new int[5];

        foriLogic(mas);
        int max = mas[0];
        for (int j : mas) {
            if(j > max) max = j;
        }
        int min = mas[0];
        for (int j : mas) {
            if(j < min) min = j;
        }
        System.out.println("Максимальное число в массиве - " + max);
        System.out.println("Минимальное число в массиве - " + min);
    }
    /**7 Task
     * Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
     * */
    static void Task7 () {
        int mas[] = new int[5];
        foriLogic(mas);

        System.out.print ("Вывели элементы в обратном порядке: ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println ("\n " + mas[i]);
        }
        System.out.println();
    }
    static void Example1 () {
        Scanner scanner = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int mas [] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элемент: ");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            mas[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + mas[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }
}