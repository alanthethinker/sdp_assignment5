package com.game.action;

import com.game.character.Character;

public class DefendAction extends GameAction {
    private final Character character;

    public DefendAction(Character character) {
        this.character = character;
    }

    @Override
    protected void performAction() {
        int defense = character.defend();
        System.out.println(character.getName() + " defends for " + defense + " protection!");
    }
}