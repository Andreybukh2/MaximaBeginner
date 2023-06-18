package org.example.Lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
}
class ObjectsMethods {
    /** Методы объектов*/
    public static void main(String[] args) {
        String string1 = new String("HELLO ");
        String string2 = "Hello";
        char aChar [] = {'H','e','l','l','o'};
        String trim = string1.trim();
        String s = string1.toLowerCase(Locale.ROOT);
        String s1 = string2.toUpperCase(Locale.ROOT);

        System.out.println("Длина - " + string1.length());
        System.out.println("Массив char - " + aChar);
        System.out.println("Конкатенация " + string2.concat(" add some logic "));
        System.out.println("Сравнили через equalsIgnoreCase " + string1.equalsIgnoreCase(string2));
        System.out.println("Сравнили через equals " + string1.equals(string2));
        System.out.println("Начинается ли на HE? - " + string1.startsWith("HE"));
        System.out.println("Заканчивается ли на LO? - " + string1.endsWith("LO"));
        System.out.println("Заменяем символы LO на LO!!! " + string1.replace("LO", "LO!!!"));
        System.out.println(trim);
        System.out.println("Перевод в нижний регистр HELLO - " + s);
        System.out.println("Перевод в верхний регистр hello - " + s1);
    }
}

class Arrays01 {
    /**Базовый цикл для заполнения массива и считывания из него данных*/
    public static void main(String[] args) {
        String[] mas = new String[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Main.scanner.nextLine();
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
class Arrays02 {
    /**
     * Базовый цикл для заполнения массива и считывания из него данных;
     * Добавили уточнение для ввода данных;
     */
    public static void main(String[] args) {
        String[] mas = new String[3];
        System.out.println("Введи " + mas.length + " элементов с клавиатуры");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Main.scanner.nextLine();
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
class Arrays03 {
    /** Поиск самой короткой и самой длинной строки в массиве*/
    public static void main(String[] args) {
        System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
        String line = Main.scanner.nextLine();
        String minLine = line;
        String maxLine = line;
        while (!line.isEmpty()) {
            if (minLine.length() > line.length()) {
                minLine = line;
            } else if (maxLine.length() < line.length()) {
                maxLine = line;
            }
            line = Main.scanner.nextLine();
        }
        if (minLine == maxLine) {
            System.out.println("Введена одна строка или строки одинаковы " + minLine);
        } else {
            System.out.println("Самая короткая строка " + minLine);
            System.out.println("Самая длинная строка строка " + maxLine);
        }
    }
}

class Arrays04 {
    /**Поиск длины строки в массиве и вывод по условию*/
    public static void main(String args[]) {
        System.out.println("Введи длину массива");
        Scanner scanner1 = new Scanner(System.in);
        int i = scanner1.nextInt();

        String[] arr = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.println("Введи следующий элемент");
            arr[j] = scanner1.next();
        }
        for (String s : arr) {
            if (s.length() % 2 == 0) {
                System.out.println("Четное количество знаков в слове, умножаем на 2 [" + s + " " + s +"]");
            }
            if (s.length() % 2 != 0) {
                System.out.println("Нечетное количество знаков в слове, умножаем на 3 [" + s + " " + s + " " + " " + s +"]");
            }
        }
    }
}
class Arrays05 {
    /** Сортировка массива по возрастанию */
    public static void main(String[] args) {
        int[] mas = {105, 54, 102, 65, 32, 6};
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

class Arrays06 {
    /** Выводит символы в обратную сторону */
    public static void main(String[] args) {
        String line = Main.scanner.nextLine();
        String reverse = "";
        char [] chars = line.toCharArray();
        for (int i = line.length() - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        System.out.print(reverse);
    }
}
class Arrays07 {
    /** Проверка на наличие знака в слове */
    public static void main(String[] args) {
        String line = Main.scanner.nextLine();
        if (line.indexOf('@') == -1) {
            System.out.println("Это не адрес почты!");
            return;
        }
        String [] split = line.split("@");
        if (split.length !=2) {
            System.out.println("Это не адрес почты! Содержит излишние знаки @");
            return;
        }
    }
}
class Arrays08 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.length() % 2 == 0)
                list1.add(s + " " + s );

            if (s.length() % 3 == 0 || s.length() % 3 != 0 && s.length() % 2 != 0)
                list1.add(s + " " + s + " " + s);

        }
        for (int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }
    }
}
class Arrays09 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Task_1 Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
         Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
         Программа выводит слова на экран.*/

        System.out.println("Введите значения в консоль");
        String string = scanner.nextLine();
        String sUpper = string.toUpperCase();

        while (!string.isEmpty()) {
            if (string.length() %2 == 0) {
                System.out.println("Сработал блок четных слов "  + sUpper + " " + sUpper );
            } sUpper = string.toUpperCase();
            if (string.length() %2 != 0) {
                System.out.println("Сработал блок нечетных слов "  + sUpper + " " + sUpper + " " + sUpper);
            }
            string = scanner.nextLine();
            sUpper = string.toUpperCase();
        }
    }
}
class Arrays10 {

    public static void main(String[] args) {
        int[] mas1 = {33, 45, 67, 89, 90, 98};
        for (int i = 0; i < mas1.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Четный индекс массива с элементами в {*****} - " + i + " равен " + mas1[i]);
            }
        }
        System.out.println();

        int[] mas2 = new int[6];
        mas2[0] = 33;
        mas2[1] = 45;
        mas2[2] = 60;
        mas2[3] = 89;
        mas2[4] = 90;
        mas2[5] = 98;
        for (int i = 0; i < mas2.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Четный индекс массива с элементами в [*****] - " + i + " равен " + mas2[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 2 == 0) {
                System.out.println("Четное значение - " + mas2[i] + " соответствует индексу массива " + i);
            }
        }
        System.out.println();
        int[] mas3 = new int[15];
        for (int i = 2; i < mas3.length; i++) {
            mas3[i] = i;
            System.out.println("Последовательное значение " + i);
        }
    }
}

class Arrays11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] Street = new int[8];
        for (int i = 0; i < Street.length; i++) {
            System.out.println("Введите количество жителей в дом № " + i);
            Street [i] = scanner.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < Street.length; i++) {
            if (i % 2 == 0) {
                even += Street[i];
            } else {
                odd += Street[i];
            }
        }
        if (even > odd) {
            System.out.println("На четной стороне живет больше людей");
        } else if (even == odd) {
            System.out.println("На обеих сторонах живет одинаковое количество людей");
        } else if (even < odd)  {
            System.out.println("На нечетной стороне живет больше людей");
        }
    }
}

class Arrays12 {
    /** Cумма всех чисел в диапазоне */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 19; i <=20 ; i++) {
            int count = 0;
            count += i;
            sum += i;
        }
        System.out.println(sum);
    }
}