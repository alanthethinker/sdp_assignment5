package com.game.state;

public class NormalState implements CharacterState {
    @Override
    public int attack() {
        return 10;
    }

    @Override
    public int defend() {
        return 5;
    }

    @Override
    public String getStateName() {
        return "Normal";
    }
}