package com.game.strategy;

public interface FightingStrategy {
    int fight();
    String getStrategyName();
}

package com.game.strategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public int fight() {
        return 15;
    }

    @Override
    public String getStrategyName() {
        return "Melee";
    }
}

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
