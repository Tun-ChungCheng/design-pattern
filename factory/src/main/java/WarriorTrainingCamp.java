public class WarriorTrainingCamp implements TrainingCamp{
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個鬥士");
        return new Warrior();
    }
}
