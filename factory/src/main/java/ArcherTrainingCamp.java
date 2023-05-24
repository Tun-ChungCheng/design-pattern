public class ArcherTrainingCamp implements TrainingCamp{
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        return new Archer();
    }
}
