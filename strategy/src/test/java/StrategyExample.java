import village.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrategyExample {
    public static void main(String[] args) {
        Village appleFarm = new Village(3, "apple Farm", 32, 5.1);
        Village barnFarm = new Village(1, "barn Farm", 22, 1.7);
        Village capeFarm = new Village(2, "cape Farm", 10, 10.2);

        List villages = new ArrayList<Village>();
        villages.add(appleFarm);
        villages.add(barnFarm);
        villages.add(capeFarm);

        System.out.println("沒排序過的資料");
        showList(villages);

        System.out.println("根據 ID 排序");
        Collections.sort(villages, new SortVillageById());
        showList(villages);

        System.out.println("根據名字排序");
        Collections.sort(villages, new SortVillageByName());
        showList(villages);

        System.out.println("根據人口排序");
        Collections.sort(villages, new SortVillageByPopulation());
        showList(villages);

        System.out.println("根據面積排序");
        Collections.sort(villages, new SortVillageByArea());
        showList(villages);

    }

    private static void showList(List villages) {
        villages.forEach(village -> System.out.println(village));
    }
}
