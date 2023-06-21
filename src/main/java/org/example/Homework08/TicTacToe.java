package org.example.Homework08;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TicTacToe {
    Scanner scanner;
    Random random;
    char[][] table;

    public TicTacToe() {
        scanner = new Scanner(System.in);
        random = new Random();
        table = new char[5][5];
    }
    public boolean checkWin(char symbol) {
        if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol && table[0][3] == symbol && table[0][4] == symbol) return true;
        if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol && table[1][3] == symbol && table[1][4] == symbol) return true;
        if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol && table[2][3] == symbol && table[2][4] == symbol) return true;

        if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol && table[3][0] == symbol && table[4][0] == symbol) return true;
        if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol && table[3][1] == symbol && table[4][1] == symbol) return true;
        if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol && table[3][2] == symbol && table[4][2] == symbol) return true;

        if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol && table[3][3] == symbol && table[4][4] == symbol) return true;
        if (table[0][4] == symbol && table[1][3] == symbol && table[2][2] == symbol && table[3][1] == symbol && table[4][0] == symbol) return true;

        return false;
    }
    public boolean isTableFull() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                if (table[x][y] == '.') return false;
            }
        }
        return true;
    }
    public void turnHuman() {
        int x, y;
        do {
            System.out.println("Введи координаты от [0...4]");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while (!isCellValid(x, y));
        {
            table[x][y] = 'x';
        }
    }
    public boolean isCellValid(int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4) {
            return false;
        } else if (table[x][y] == '.'); {
            return true;
        }
    }
    public void printTable () {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void initTable () {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = '.';
            }
        }
    }
    public void playGame() {
        System.out.println("Игра началась");
        initTable();

        while (true) {
            turnHuman();
            if (checkWin('x')) {
                printTable();
                System.out.println("Вы победили");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('o')) {
                printTable();
                System.out.println("AI победил");
                break;
            }
        }
    }
    public void turnAI() {
        int x, y;

        do {
            x = ThreadLocalRandom.current().nextInt(0,4);
            y = ThreadLocalRandom.current().nextInt(0,4);

        } while (!isCellValid(x, y));

        table[x][y] = 'o';
    }
}
