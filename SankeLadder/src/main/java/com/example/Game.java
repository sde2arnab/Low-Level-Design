package com.example;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    List<Move> moves;
    Boolean isGameEnd;
    Dice dice;
    Deque<Player> play;

    public Game(){
        board = new Board();
        moves=new ArrayList<>();
        isGameEnd=false;
        dice = new Dice();
        players = new ArrayList<>();
        play = new LinkedList<>();
    }
    public void createPlayer(String name){
        Player player = new Player(name);
        players.add(player);
        play.add(player);
    }

    public void createSnake(int head,int tail){
        board.createSnake(head,tail);
    }

    public void createLadder(int head,int tail){
        board.createLadder(head,tail);
    }

    void startGame(){
        while(!isGameEnd){
            Player currentPlayer = play.removeFirst();
            int diceRoll = dice.rollDice();
            Move move = new Move(currentPlayer.position,currentPlayer.position,diceRoll,currentPlayer);
            int position = currentPlayer.position;
            if(position == 0 && diceRoll!=6){
                play.addLast(currentPlayer);
                moves.add(move);
                System.out.println(move.toString());
                continue;
            }
            else if(position == 0 && diceRoll==6){
                System.out.println(move.toString());
                diceRoll=dice.rollDice();
                move.setDiceValue(diceRoll);
            }

            position += diceRoll;
            int ladderPosition=0,snakePosition=0;
            ladderPosition = board.checkLadder(position);
            snakePosition= board.checkSnake(position);
            if(ladderPosition!=0) position=ladderPosition;
            else if(snakePosition!=0) position=snakePosition;

            if(position==100){
                isGameEnd=true;
            }
            else if(position>100)
                position-=diceRoll;
            move.setEnd(position);
            moves.add(move);
            currentPlayer.position=position;
            System.out.println(move.toString());
            if(isGameEnd){
                System.out.println(currentPlayer.getName()+" wins the game");
            }
            if(diceRoll==6)
                play.addFirst(currentPlayer);
            else
                play.addLast(currentPlayer);
        }
    }
}
