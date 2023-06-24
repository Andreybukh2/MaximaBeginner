package org.example;

import java.util.ArrayList;

import static org.example.App.scanner;

/** Task01
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строк.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
public class Homework12 {
    public static void Task1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Фраза1");
        list.add("Фраза2");
        list.add("Фраза3");
        list.add("Фраза4");
        list.add("Фраза5");

        System.out.println(list.size());
        list.forEach(System.out::println);
    }

    /**
     * Task02
     * 2
     * 1. Создай список строк.
     * 2. Считай с клавиатуры 5 строк и добавь в список.
     * 3. Используя цикл, найди самую длинную строку в списке.
     * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
     */
    public static void Task2() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.println("Введи элемент " + i);
            stringArrayList.add(scanner.nextLine());
        }
        System.out.println("Всего элементов в списке - " + stringArrayList.size());
        stringArrayList.forEach(System.out::println);
    }

    /**
     * Task03
     * 1. Создай список строк.
     * 2. Считай с клавиатуры 5 строк и добавь в список.
     * 3. Используя цикл, найди самую короткую строку в списке.
     * 4. Выведи найденную строку на экран.
     * 5. Если таких строк несколько, выведи каждую с новой строки.
     */
    public static void Task3() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            System.out.println("Введи элемент " + i);
            stringArrayList.add(scanner.nextLine());
        }
        int min = stringArrayList.get(0).length(); //Ввели переменную которая получает 0 элемент и сразу получает длину строки
        int max = min;                             // Переопределили переменную, не совсем понимаю зачем;
        for (String s : stringArrayList) {         // Цикл проходит по элементам и
            if (s.length() > max)
                max = s.length();                  // если длина элемента больше максимальной, то эта длина запишется как максимальная;
            if (s.length() < min)
                min = s.length();                  // если длина элемента меньше минимальной, то эта длина запишется как минимальная;
        }
        for (String s : stringArrayList) {
            if (s.length() == min) {                // если длина минимальная, то выводи в консоль
                System.out.println("Самая короткая строка - " + s + ", имеет длину - " + s.length() + " символа");
                break;
            }
        }
    }

    /**
     * Task5
     * 1. Создай список строк.
     * 2. Добавь в него 5 строк с клавиатуры.
     * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
     * 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
     */
    public static void Task5() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            System.out.println("Введи элемент " + i);
            stringArrayList.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String str = stringArrayList.remove(stringArrayList.size() - 1); // Создал переменную в которую кладу последний элемент
            stringArrayList.add(0, str);                                   // Передаю этот элемент в начало массива методом add;
        }
        stringArrayList.forEach(System.out::println);
    }

    public static void Task6() {
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        /**Можно было ввести любое int число, например
         * 1 000 000 или 1 000 итд понимая что длина слов такой не бывает, но для удобства берем,
         * "Целое число.MAX_VALUE" - это константа в целочисленном классе
         * пакета java.lang, которая указывает, что в нем хранится максимально
         * возможное значение для любой целочисленной переменной в Java.  */
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            System.out.println("Введи элемент " + i);
            stringArrayList.add(scanner.nextLine());
            if (stringArrayList.get(i).length() > maxLength) maxLength = stringArrayList.get(i).length();
            if (stringArrayList.get(i).length() < minLength) minLength = stringArrayList.get(i).length();
            /**Методом get получаем при каждой итерации из коллекции элемент и по условию Если, сравниваем
             * сначала с 0 - длинны, потом с первым элементом итд и если при итерации длина больше чем текущая
             * максимальная длина, то присваиваем ее в переменную максимальной длины
             * Если при итерации текущая дилина меньше минимально, то присваиваем в минимальную*/
        }
        if (maxLength == minLength) System.out.println("Все введенные строки имеют одинаковую длину");
        else {
            for (String string : stringArrayList) {
                if (string.length() == maxLength) {
                    System.out.println("Раньше встретилась самая длинная строка: \n" + string);
                    break;
                }
                if (string.length() == minLength) {
                    System.out.println("Раньше встретилась самая короткая строка: \n" + string);
                    break;
                }
            }
        }
    }

    public static void Task7() {
        /**
         * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
         Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
         Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
         Порядок объявления списков очень важен.
         1.1 Создай метод printList
         2. Метод printList должен выводить на экран все элементы списка с новой строки.
         3. Используя метод printList выведи эти три списка на экран.
         Сначала тот, который для x%3, потом тот, который для x%2, потом последний. */

        /** Базовая конструкция для наполнения коллекции через Scanner */
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        ArrayList<Integer> integerArrayList3 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Введи элемент " + i);
            integerArrayList.add(scanner.nextInt());
        }
        /** Цикл проходит по заполненному массиву коллекции, методом get получая элемент и проверяя на условия
         * деления на 3 и на 2 без остатка, и если это число попадает под это условие, то оно попадает и в коллекцию1 и в коллекцию2, в
         * ином случае переходит в коллекцию прочие. Добавления происходят через метод add
         * сразу же через метод get опять возвращается и в новом цикле если где далее добавляются по методам в соответствии с условиями */
        for (int i = 0; i < 6; i++) {
            if (integerArrayList.get(i) % 3 == 0 && integerArrayList.get(i) % 2 == 0) {
                integerArrayList1.add(integerArrayList.get(i));
                integerArrayList2.add(integerArrayList.get(i));
            } else if (integerArrayList.get(i) % 3 == 0) {
                integerArrayList1.add(integerArrayList.get(i));
            } else if (integerArrayList.get(i) % 2 == 0) {
                integerArrayList2.add(integerArrayList.get(i));
            } else {
                integerArrayList3.add(integerArrayList.get(i));
            }
        }
        /** блок вывода на консоль */
        System.out.println("Список делится на 3");
        printList(integerArrayList1);
        System.out.println("Список делится на 2");
        printList(integerArrayList2);
        System.out.println("Список остальные");
        printList(integerArrayList3);
    }
    /** Метод имеет параметризацию базовым integerArrayList в который попали изначально все элементы из сканнера */

    private static void printList(ArrayList<Integer> integerArrayList) {
        for (Integer i : integerArrayList)
            System.out.println(i);
    }
}

class Task4 {
    /**
     * Task04
     * 1. Создай список строк в методе main.
     * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
     * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
     */
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            System.out.println("Введи элемент " + i);
            stringArrayList.add(0, scanner.nextLine());
        }
        System.out.println("Всего элементов в списке - " + stringArrayList.size());
        stringArrayList.forEach(System.out::println);
    }
}
