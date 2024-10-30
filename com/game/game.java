package com.game;

import com.game.character.Character;
import com.game.state.PoweredUpState;
import com.game.strategy.MagicStrategy;
import com.game.action.AttackAction;
import com.game.action.DefendAction;
import com.game.action.HealAction;
import com.game.action.GameAction;
import com.game.visitor.EffectVisitor;
import com.game.visitor.StatusEffectVisitor;

public class Main {
    public static void main(String[] args) {
        // Create a character
        Character hero = new Character("Hero");

        // Test different states
        System.out.println("\nTesting States:");
        System.out.println("Initial state: " + hero.getStateName());
        hero.setState(new PoweredUpState());
        System.out.println("New state: " + hero.getStateName());

        // Test different strategies
        System.out.println("\nTesting Strategies:");
        System.out.println("Initial strategy: " + hero.getStrategyName());
        hero.setStrategy(new MagicStrategy());
        System.out.println("New strategy: " + hero.getStrategyName());

        // Test template pattern with different actions
        System.out.println("\nTesting Actions:");
        GameAction attack = new AttackAction(hero);
        attack.executeAction();

        GameAction defend = new DefendAction(hero);
        defend.executeAction();

        GameAction heal = new HealAction(hero);
        heal.executeAction();

        // Test visitor pattern
        System.out.println("\nTesting Visitor:");
        EffectVisitor effectVisitor = new StatusEffectVisitor();
        hero.accept(effectVisitor);
    }
}