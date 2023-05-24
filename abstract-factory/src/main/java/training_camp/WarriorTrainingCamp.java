package training_camp;

import adventurer.Adventurer;
import adventurer.Archer;
import adventurer.Warrior;
import factory.WarriorEquipFactory;

public class WarriorTrainingCamp implements TrainingCamp{
    public static WarriorEquipFactory factory = new WarriorEquipFactory();

    public Adventurer trainAdventurer() {
        System.out.println("訓練一個鬥士");
        Warrior warrior = new Warrior();
        warrior.setWeapon(factory.productWeapon());
        warrior.setClothes(factory.productClothes());
        return warrior;
    }
}
