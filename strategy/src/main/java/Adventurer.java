import fight_strategy.FightStrategy;
import fight_strategy.NormalAttack;

public class Adventurer {
    FightStrategy fightStrategy;

    public void attack () {
        if (fightStrategy == null) {
            fightStrategy = new NormalAttack();
        }
        fightStrategy.execute();
    }

    public void choiceStrategy (FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }
}
