package com.game.state;

public interface CharacterState {
    int attack();
    int defend();
    String getStateName();
}

package com.game.state;

public class NormalState implements CharacterState {
    @Override
    public int attack() {
        return 10;
    }

    @Override
    public int defend() {
        return 5;
    }

    @Override
    public String getStateName() {
        return "Normal";
    }
}

package com.game.state;

public class PoweredUpState implements CharacterState {
    @Override
    public int attack() {
        return 20;
    }

    @Override
    public int defend() {
        return 10;
    }

    @Override
    public String getStateName() {
        return "Powered Up";
    }
}

package com.game.state;

public class DefeatedState implements CharacterState {
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public String getStateName() {
        return "Defeated";
    }
}