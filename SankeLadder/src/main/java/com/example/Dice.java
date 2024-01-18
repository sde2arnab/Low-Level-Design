package com.example;

import java.util.Random;

public class Dice {
    private int maxSize;

    public int getMaxSize() {
        return maxSize;
    }
    public int rollDice(){
        return new Random().nextInt(6)+1;
    }
    public Dice(){
        maxSize = 6;
    }
}
