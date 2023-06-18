package org.example;

import java.util.Scanner;

/**1 Ввести с клавиатуры два числа m и n.
 Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 Пример: m=2, n=4
 8888
 8888
 */
public class Homework04 {

    static void Task1 () {
        int m = 2;
        int n = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.print("" + "\n");
        }
    }

    /**2 Это решение сразу не пришло в голову и пришлось искать в инете, но по смыслу разобрался через дебагер что
     * во втором цикле j будет столько раз, сколько будет i, соответственно когда i = 1, то отпринтит одну  восьмерку,
     * когда i станет 2, то j отпринтит 2 восьмерки итд пока i не достигнет предела в m=10
     * */
    static void Task2 () {
        int m = 10;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print ("8");
            }
            System.out.print (""+"\n");
        }
    }
    /**3
     * Ввести с клавиатуры три числа, вывести на экран среднее из них.
     * Т.е. не самое большое и не самое маленькое.
     * Если все числа равны, вывести любое из них.
     */
    static void Task3 () {
        Scanner scanner = new Scanner(System.in);
        double [] mas = new double[3];
        double range = mas.length;
        double avr;
        double sum = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите элемент массива № " + i);
            mas [i] = scanner.nextInt();
        }
        for (double value : mas) {
            sum += value;
        }
        avr = sum / range;
        System.out.println(avr);
    }
    /**4 Не смог решить сам, но разобрался в принципе этого алгоритма */
    static void Task4 () {
        int a = 1;
        int b = 1;
        while (a !=11){
            while (b !=11) {
                System.out.print(a * b + " ");
                b++;}
            System.out.println();
            a++;
            b=1;
        }
    }
    static void Task5 () {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("My name is %s ", name);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.print("I was born in " + num1 + "." + num2 + "." + num3);
    }
}