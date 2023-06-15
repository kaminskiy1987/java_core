package ru.geekbrains.hw2;

public class Task3 {
    // Написать функцию, возвращающую истину, если в переданном массиве есть два
    // соседних элемента, с нулевым значением.
    public static void main(String[] args) {
        int[] arrayInt = new int[] { 2, 1, 0, 0, 4, 2, 1, 0, 3, 0 };

        System.out.println(isZeros(arrayInt));
    }

    public static boolean isZeros(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == array[i]) {
                return true;
            }
        }

        return false;
    }
}