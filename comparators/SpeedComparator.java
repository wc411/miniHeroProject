package miniheroproject.comparators;

import java.util.Comparator;
import miniheroproject.data.HeroCard;

/**
 * @author Krypton
 */
public class SpeedComparator implements Comparator<HeroCard>{

    @Override
    public int compare(HeroCard o1, HeroCard o2) {
        return compareTo(o1, o2);
    }

    public int compareTo(HeroCard o1, HeroCard o2) {
        if (o1.getSpeed() > o2.getSpeed()) {
            return 1;
        } else if (o1.getSpeed() < o2.getSpeed()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
