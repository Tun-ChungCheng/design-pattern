import adventurer.Adventurer;
import clothes.Clothes;
import factory.ArcherEquipFactory;
import factory.EquipFactory;
import factory.WarriorEquipFactory;
import org.junit.Assert;
import org.junit.Test;
import training_camp.ArcherTrainingCamp;
import training_camp.TrainingCamp;
import training_camp.WarriorTrainingCamp;
import weapon.Weapon;

public class EquipFactoryTest {
    private EquipFactory equipFactory;

    @Test
    public void equipFactoryTest() {
        System.out.println("======= 抽象工廠模式測試 =======");

        equipFactory = new ArcherEquipFactory();
        Clothes archerLeather = equipFactory.productClothes();
        Weapon archerBow = equipFactory.productWeapon();

        Assert.assertEquals(5, archerLeather.getDef());
        Assert.assertEquals(10, archerBow.getAtk());
        Assert.assertEquals(10, archerBow.getRange());

        equipFactory = new WarriorEquipFactory();
        Clothes warriorArmor = equipFactory.productClothes();
        Weapon warriorLongSword = equipFactory.productWeapon();

        Assert.assertEquals(10, warriorArmor.getDef());
        Assert.assertEquals(10, warriorLongSword.getAtk());
        Assert.assertEquals(1, warriorLongSword.getRange());

        TrainingCamp camp = new ArcherTrainingCamp();
        Adventurer archer = camp.trainAdventurer();

        camp = new WarriorTrainingCamp();
        Adventurer warrior = camp.trainAdventurer();

        archer.display();
        warrior.display();
    }
}
