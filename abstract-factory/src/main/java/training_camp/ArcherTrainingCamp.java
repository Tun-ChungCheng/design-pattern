package training_camp;

import adventurer.Adventurer;
import adventurer.Archer;
import factory.ArcherEquipFactory;
import factory.EquipFactory;

public class ArcherTrainingCamp implements TrainingCamp{
    private static EquipFactory factory = new ArcherEquipFactory();

    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        Archer archer = new Archer();
        archer.setWeapon(factory.productWeapon());
        archer.setClothes(factory.productClothes());
        return archer;
    }
}
