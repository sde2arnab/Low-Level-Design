package com.example;

public class Move {
        private int start;
        private int end;
        private int diceValue;
        private Player player;

    @Override
    public String toString() {
        return player.getName()+" rolled a "+ diceValue + " and moved from " +
                + start + " to " + end;
    }

    public Move(int start, int end, int diceValue, Player player) {
        this.start = start;
        this.end = end;
        this.diceValue = diceValue;
        this.player = player;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
