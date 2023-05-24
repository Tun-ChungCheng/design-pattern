package village;

import java.util.Comparator;

public class SortVillageByName implements Comparator<Village> {
    public int compare(Village o1, Village o2) {
        if (o1.name.charAt(0) > o2.name.charAt(0)) {
            return 1;
        }

        if (o1.name.charAt(0) < o2.name.charAt(0)) {
            return -1;
        }
        return 0;
    }
}
