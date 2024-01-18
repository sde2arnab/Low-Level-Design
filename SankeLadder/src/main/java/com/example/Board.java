package com.example;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final Cell[] cells;
    private Map<Integer,Integer> ladders;
    private Map<Integer,Integer> snakes;
    public Board(){
        cells = new Cell[101];
        for(int i=0;i<=100;i++) {
            cells[i] = new Cell();
            cells[i].setNumber(i);
        }
        ladders = new HashMap<>();
        snakes = new HashMap<>();
    }
    public void createLadder(int head,int tail){
        ladders.computeIfAbsent(head,k-> tail);
    }

    public void createSnake(int head,int tail){
        snakes.computeIfAbsent(head,k-> tail);
    }

    public int checkLadder(int position){
        if(ladders.containsKey(position)) {
            int ladderPosition = ladders.get(position);
            if(checkSnake(ladderPosition)!=0)
                return  checkSnake(ladderPosition);
            return ladderPosition;
        }
        return 0;
    }
    public int checkSnake(int position){
        if(snakes.containsKey(position)) {
            int snakePosition = snakes.get(position);
            if(checkLadder(snakePosition)!=0)
                return checkLadder(snakePosition);
            return snakePosition;
        }
        return 0;
    }
}
