package village;

import java.util.Comparator;

public class SortVillageByArea implements Comparator<Village> {
    public int compare(Village o1, Village o2) {
        if (o1.area > o2.area) {
            return 1;
        }

        if (o1.area < o2.area) {
            return -1;
        }
        return 0;
    }
}
