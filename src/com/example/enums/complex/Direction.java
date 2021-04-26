package com.example.enums.complex;

public enum Direction {

    NORTH("in a notherly direction..."),
    SOUTH("in a southerly direction..."),
    EAST("in a eastherly direction..."),
    WEST("in a westherly direction...");

    String direction;

    Direction(String direction) {
        this.direction = direction;

    }

    @Override
    public String toString() {
        return "We are travelling " + direction;

    }

}
