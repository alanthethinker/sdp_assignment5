package com.game.strategy;

public class RangedStrategy implements FightingStrategy {
    @Override
    public int fight() {
        return 12;
    }

    @Override
    public String getStrategyName() {
        return "Ranged";
    }
}