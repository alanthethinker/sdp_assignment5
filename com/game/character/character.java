package com.game.character;

import com.game.state.CharacterState;
import com.game.state.NormalState;
import com.game.strategy.FightingStrategy;
import com.game.strategy.MeleeStrategy;
import com.game.visitor.EffectVisitor;

public class Character {
    private String name;
    private CharacterState state;
    private FightingStrategy strategy;
    private int health = 100;

    public Character(String name) {
        this.name = name;
        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public int attack() {
        return state.attack() + strategy.fight();
    }

    public int defend() {
        return state.defend();
    }

    public void accept(EffectVisitor visitor) {
        visitor.applyBoost(this);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getStateName() {
        return state.getStateName();
    }

    public String getStrategyName() {
        return strategy.getStrategyName();
    }
}