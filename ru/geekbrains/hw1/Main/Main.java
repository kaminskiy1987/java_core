package ru.geekbrains.hw1.Main;

import ru.geekbrains.hw1.Сlasses.View;
import ru.geekbrains.hw1.Сlasses.Model;

/**
 * Игра в угадывание случайного число от 1 до 1000 за 10 попыток.
 */
public class Main {
    public static void main(String[] args) {

        View view = new View();
        Model model = new Model();

        Integer number = model.numberGenerate();
        view.startMenu(
                model.getLowerLimit(),
                model.getUpperLimit(),
                model.getNumberCount()
        );

        boolean isWin = false;

        for (int i = 0; i < model.getNumberCount(); i++) {
            Integer userNumber = view.inputNumber(i + 1);

            if (userNumber.equals(number)) {
                view.winMessage(number, i + 1);
                isWin = true;
                break;
            } else
                view.hintMessage(number, userNumber);
        }

        if (!isWin)
            view.loseMessage(number);
    }
}