package ru.geekbrains.hw2.snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame {
    final String TITLE_OF_PROGRAM = "Classic Game Snake";
    final String GAME_OVER_MSG = "GAME OVER";
    final static int CELL_SIZE = 20;
    final static int CANVAS_WIDTH = 30;
    final static int CANVAS_HEIGHT = 25;
    final static Color SNAKE_COLOR = Color.darkGray;
    final static Color FOOD_COLOR = Color.green;
    final static Color POISON_COLOR = Color.red;
    final static int KEY_LEFT = 37;
    final static int KEY_UP = 38;
    final static int KEY_RIGHT = 39;
    final static int KEY_DOWN = 40;
    final int START_SNAKE_SIZE = 5;
    final int START_SNAKE_X = CANVAS_WIDTH / 2;
    final int START_SNAKE_Y = CANVAS_HEIGHT / 2;
    final int SNAKE_DELAY = 150;
    int snakeSize = 0;
    static boolean gameOver = false;
    static boolean stateGame = true;

    Canvas canvas;
    Snake snake;
    Food food;
    Poison poison;

    public static void main(String[] args) {
        new GameSnake().game();
    }

    public GameSnake() {
        setTitle(TITLE_OF_PROGRAM);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH, CELL_SIZE * CANVAS_HEIGHT));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void game() {
        snake = new Snake(
                START_SNAKE_X,
                START_SNAKE_Y,
                START_SNAKE_SIZE,
                KEY_RIGHT);

        food = new Food(snake);
        snake.setFood(food);

        poison = new Poison(snake);
        snake.setPoison(poison);

        while (stateGame) {
            snake.move();

            if (gameOver) {
                setTitle(GAME_OVER_MSG);
                stateGame = false;
            }

            if (snake.size() > snakeSize) {
                snakeSize = snake.size();
                setTitle(TITLE_OF_PROGRAM + ": " + snakeSize);
            }
        }

        if (food.isEaten()) {
            food.appear();
        }

        if (poison.isEaten()) {
            poison.appear();
        }

        canvas.repaint();
        sleep(SNAKE_DELAY);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            snake.paint(g2D);
            food.paint(g2D);
            poison.paint(g2D);
        }
    }
}
