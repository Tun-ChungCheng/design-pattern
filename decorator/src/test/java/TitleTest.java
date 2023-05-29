import org.junit.Test;

public class TitleTest {
    @Test
    public void test() {
        Adventurer lancer = new Lancer("Jacky");
        System.out.println("--- 長槍兵 Jacky ---");
        lancer.attack();

        System.out.println();
        System.out.println("--- 取得強壯稱號的 Jacky ---");
        TitleStrong sJacky = new TitleStrong(lancer);
        sJacky.attack();

        System.out.println();
        System.out.println("--- 取得敏捷稱號的 Jacky ---");
        TitleAgile aJacky = new TitleAgile(sJacky);
        aJacky.attack();
        aJacky.useFlash();

        System.out.println();
        System.out.println("--- 取得燃燒稱號的 Jacky ---");
        TitleInFire fJacky = new TitleInFire(sJacky);
        fJacky.attack();
        fJacky.fireball();

        System.out.println();
        System.out.println("--- Jacky 決定成為一個非常強壯的槍兵 ---");
        TitleStrong ssJacky = new TitleStrong(fJacky);
        ssJacky.attack();
    }
}
