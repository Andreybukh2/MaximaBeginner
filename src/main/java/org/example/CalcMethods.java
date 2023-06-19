package org.example;

import static org.example.CalcMain.scanner;

public class CalcMethods {
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        num = scanner.nextInt();
        return num;
    }
    public static char getOperation() {
        System.out.println("Введите математическое действие: ");
        char operation;
        scanner.hasNext();
        {
            operation = scanner.next().charAt(0);
            return operation;
        }
    }
    public static int countNum (int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                result = countNum (num1, num2, getOperation());
        }
        return result;
    }
}