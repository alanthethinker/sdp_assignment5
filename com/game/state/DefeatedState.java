package com.game.state;

public class DefeatedState implements CharacterState {
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public String getStateName() {
        return "Defeated";
    }
}