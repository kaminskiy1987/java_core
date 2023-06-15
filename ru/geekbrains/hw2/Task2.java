package ru.geekbrains.hw2;

public class Task2 {
    // Написать функцию, возвращающую разницу между самым
    // большим и самым маленьким элементами переданного не пустого массива.
    public static void main(String[] args) {
        int[] arrayInt = new int[] { 2, 1, 2, 3, 4, 2, 1, 156, 3, 4 };

        maxMinDiff(arrayInt);
    }

    public static void maxMinDiff(int[] array) {
        int result;

        if (array.length == 0) {
            System.out.println("массив пуст");
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] >array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            result = array[array.length - 1] - array[0];

            System.out.println(result);
        }
    }
}