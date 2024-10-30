package com.game.visitor;

import com.game.character.Character;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}

package com.game.visitor;

import com.game.character.Character;
import com.game.state.PoweredUpState;
import com.game.state.DefeatedState;

public class StatusEffectVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying boost to " + character.getName());
        character.setState(new PoweredUpState());
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("Applying damage to " + character.getName());
        if (character.getHealth() <= 0) {
            character.setState(new DefeatedState());
        }
    }
}
