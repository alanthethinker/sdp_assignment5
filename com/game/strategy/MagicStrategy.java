package com.game.strategy;

public class MagicStrategy implements FightingStrategy {
    @Override
    public int fight() {
        return 18;
    }

    @Override
    public String getStrategyName() {
        return "Magic";
    }
}