package ru.geekbrains.hw1.Сlasses;

import java.util.Scanner;

/**
 * Класс отвечает за ввод/вывод через консоль.
 */

public class View {
    /**
     * Метод, запроса числа на ввод, указывая номер попытки ввода.
     *
     * @param number порядковый номер попытки ввода числа.
     * @return введенное число.
     */
    public Integer inputNumber(Integer number) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Попытка № %d: ", number);
        return scan.nextInt();
    }

    /**
     * Метод вывода в консоль стартового сообщения.
     *
     * @param lowerLimit  нижняя возможная граница загаданного числа.
     * @param upperLimit  верхняя возможная граница загаданного числа.
     * @param numberCount количество возможных попыток угадать число.
     */
    public void startMenu(Integer lowerLimit, Integer upperLimit, Integer numberCount) {
        System.out.printf("""
                        Загадано число от %d до %d.
                        У вас есть %d попыток, чтобы угадать это число. Удачи! ;)
                        """,
                lowerLimit, upperLimit, numberCount
        );
    }

    /**
     * Метод вывода в консоль сообщения о победе.
     *
     * @param number      загаданное число.
     * @param numberCount количество попыток, потребовавшихся, чтобы отгадать число.
     */
    public void winMessage(Integer number, Integer numberCount) {
        System.out.printf("Поздравляю! Вы отгадали число %d за %d попыток.", number, numberCount);
    }

    /**
     * Метод вывода в консоль сообщения о поражении.
     *
     * @param number загаданное число.
     */
    public void loseMessage(Integer number) {
        System.out.printf("Вам не повезло. Было загадано число %d.", number);
    }

    /**
     * Метод вывода в консоль сообщения-подсказки.
     *
     * @param number     загаданное число.
     * @param userNumber число, предложенное пользователем.
     */
    public void hintMessage(Integer number, Integer userNumber) {
        if (number > userNumber)
            System.out.println("Загаданное число больше.");
        else
            System.out.println("Загаданное число меньше.");
    }
}