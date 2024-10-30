package com.game.state;

public class PoweredUpState implements CharacterState {
    @Override
    public int attack() {
        return 20;
    }

    @Override
    public int defend() {
        return 10;
    }

    @Override
    public String getStateName() {
        return "Powered Up";
    }
}