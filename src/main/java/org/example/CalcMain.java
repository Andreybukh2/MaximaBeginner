package org.example;

import java.util.Scanner;

import static org.example.CalcMethods.*;

public class CalcMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = countNum (num1,num2,operation);
        System.out.println("Результат: "+ result);
    }
}
