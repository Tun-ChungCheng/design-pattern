import org.junit.Assert;
import org.junit.Test;

public class VillageTest {
    @Test
    public void test () {
        Adventurer memberA = TrainingCamp.trainAdventurer("archer");
        Adventurer memberB = TrainingCamp.trainAdventurer("warrior");
        Assert.assertEquals(memberA.getType(), "Archer");
        Assert.assertEquals(memberB.getType(), "Warrior");
    }
}
