package ru.geekbrains.hw5.javacore.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fileName = "gameBuild.bin";
        Game.gameStart(fileName);

        int[] numbers = GameField.loadField(fileName);
        System.out.println("Состояние игрового поля:\n" + Arrays.toString(numbers));
    }
}