package org.example.Homework08;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    //

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.playGame();
    }
}