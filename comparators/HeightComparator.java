package miniheroproject.comparators;

import java.util.*;
import miniheroproject.data.HeroCard;

/**
 * @author Krypton
 */
public class HeightComparator implements Comparator<HeroCard> {

    @Override
    public int compare(HeroCard o1, HeroCard o2) {
        return compareTo(o1, o2);
    }

    public int compareTo(HeroCard o1, HeroCard o2) {
        if (o1.getHeight() < o2.getHeight()) {
            return 1;
        } else if (o1.getHeight() > o2.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }

}
