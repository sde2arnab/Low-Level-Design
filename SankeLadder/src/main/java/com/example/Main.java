package com.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.createPlayer("Gaurav");
        game.createPlayer("Sagar");
        game.createLadder(2,37);
        game.createLadder(16,46);
        game.createLadder(10,32);
        game.createLadder(51,68);
        game.createLadder(61,79);
        game.createLadder(60,84);
        game.createLadder(71,91);
        game.createLadder(81,100);

        game.createSnake(62,5);
        game.createSnake(33,6);
        game.createSnake(49,9);
        game.createSnake(84,16);
        game.createSnake(41,20);
        game.createSnake(56,53);
        game.createSnake(98,64);
        game.createSnake(93,73);
        game.createSnake(95,75);
        game.startGame();
    }
}