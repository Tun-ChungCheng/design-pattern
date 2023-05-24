package village;

import java.util.Comparator;

public class SortVillageById implements Comparator<Village> {
    public int compare(Village o1, Village o2) {
        if (o1.id > o2.id) {
            return 1;
        }

        if (o1.id < o2.id) {
            return -1;
        }
        return 0;
    }
}
