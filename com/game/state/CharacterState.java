package com.game.state;

public interface CharacterState {
    int attack();
    int defend();
    String getStateName();
}