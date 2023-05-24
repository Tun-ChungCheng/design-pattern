package village;

import java.util.Comparator;

public class SortVillageByPopulation implements Comparator<Village> {
    public int compare(Village o1, Village o2) {
        if (o1.population > o2.population) {
            return 1;
        }

        if (o1.population < o2.population) {
            return -1;
        }
        return 0;
    }
}
