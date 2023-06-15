package ru.geekbrains.hw2;

public class Task1 {
    // Написать метод, возвращающий количество
    // чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static void main(String[] args) {
        int[] array1 = new int[] { 2, 1, 2, 3, 4 };
        int[] array2 = new int[] { 2, 2, 0 };
        int[] array3 = new int[] { 1, 3, 5 };

        System.out.println(countEvens(array1));
        System.out.println(countEvens(array2));
        System.out.println(countEvens(array3));
    }

    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i <  array.length; i++) {
            if ( array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}