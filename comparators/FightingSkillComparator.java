package miniheroproject.comparators;

import java.util.Comparator;
import miniheroproject.data.HeroCard;

/**
 * @author Krypton
 */
public class FightingSkillComparator implements Comparator<HeroCard>{

    @Override
    public int compare(HeroCard o1, HeroCard o2) {
        return compareTo(o1, o2);
    }

    public int compareTo(HeroCard o1, HeroCard o2) {
        if (o1.getFightingSkills() < o2.getFightingSkills()) {
            return 1;
        } else if (o1.getFightingSkills() > o2.getFightingSkills()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
