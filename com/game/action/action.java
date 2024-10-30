package com.game.action;

public abstract class GameAction {
    public final void executeAction() {
        startAction();
        performAction();
        endAction();
    }

    protected void startAction() {
        System.out.println("Starting action...");
    }

    protected abstract void performAction();

    protected void endAction() {
        System.out.println("Ending action...");
    }
}

package com.game.action;

import com.game.character.Character;

public class AttackAction extends GameAction {
    private Character character;

    public AttackAction(Character character) {
        this.character = character;
    }

    @Override
    protected void performAction() {
        int damage = character.attack();
        System.out.println(character.getName() + " attacks for " + damage + " damage!");
    }
}

package com.game.action;

import com.game.character.Character;

public class DefendAction extends GameAction {
    private Character character;

    public DefendAction(Character character) {
        this.character = character;
    }

    @Override
    protected void performAction() {
        int defense = character.defend();
        System.out.println(character.getName() + " defends for " + defense + " protection!");
    }
}

package com.game.action;

import com.game.character.Character;

public class HealAction extends GameAction {
    private Character character;

    public HealAction(Character character) {
        this.character = character;
    }

    @Override
    protected void performAction() {
        System.out.println(character.getName() + " heals for 20 HP!");
    }
}