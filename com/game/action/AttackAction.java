package com.game.action;

import com.game.character.Character;

public class AttackAction extends GameAction {
    private final Character character;

    public AttackAction(Character character) {
        this.character = character;
    }

    @Override
    protected void performAction() {
        int damage = character.attack();
        System.out.println(character.getName() + " attacks for " + damage + " damage!");
    }
}