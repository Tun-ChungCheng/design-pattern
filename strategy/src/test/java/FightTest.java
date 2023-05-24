import fight_strategy.NormalAttack;
import fight_strategy.UseItem;
import fight_strategy.UserSkill;
import org.junit.Test;

public class FightTest {

    @Test
    public void test () {
        Adventurer adventurer = new Adventurer();

        System.out.println("出現史萊姆>");
        adventurer.choiceStrategy(new NormalAttack());
        adventurer.attack();
        System.out.println();

        System.out.println("出現非常非常巨大的史萊姆>");
        adventurer.choiceStrategy(new UserSkill());
        adventurer.attack();
        System.out.println();

        System.out.println("出現不怕刀槍的殭屍>");
        adventurer.choiceStrategy(new UseItem());
        adventurer.attack();
        System.out.println();
    }
}
