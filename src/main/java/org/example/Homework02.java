package org.example;

public class Homework02 {
/** Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?*/
/** Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь. (По аналогии с первым алгоритмом);*/
/** Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут, насколько быстрее голодный Вася съедает один банан?*/
/**
Используем тип данных double или float потому что результат таких задач не всегда целое число;
Для оптимизации ресурсов по возможности лучше выбирать менее ресурсоемкий тип, поэтому я выбрал float 4 байт.
Так же я присвоил модификатор static для переменных, что бы их значение было постоянным во всех других классах и не нужно
было бы создавать экземпляр для использования переменной. Таким образом память выделяется только один раз.*/

    public class Tasks123 {
        static float money = 5;
        static float Cash_register = 2;
        static float result = money/Cash_register;
        static float a = 50;
        static float b = 20;
        static float square = a * b;
        static float timeHungry = 9;
        static float timeFull = 15;
        static float bananas = 3;
        static float resultCountBananasHungry = timeHungry/bananas;
        static float resultCountBananasFull = timeFull/bananas;
        static float resultDifference = resultCountBananasFull-resultCountBananasHungry;
    }
}
