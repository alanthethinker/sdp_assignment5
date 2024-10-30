package com.game.strategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public int fight() {
        return 15;
    }

    @Override
    public String getStrategyName() {
        return "Melee";
    }
}
