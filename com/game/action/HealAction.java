package com.game.action;

import com.game.character.Character;

public class HealAction extends GameAction {
    private final Character character;

    public HealAction(Character character) {
        this.character = character;
    }

    @Override
    protected void performAction() {
        System.out.println(character.getName() + " heals for 20 HP!");
    }
}