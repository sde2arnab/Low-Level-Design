package com.example;

public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int position=0;
    public Player(String name) {
        this.name=name;
    }
}
