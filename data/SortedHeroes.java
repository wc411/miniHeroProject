package miniheroproject.data;

import miniheroproject.comparators.SpeedComparator;
import miniheroproject.data.HeroCard;
import miniheroproject.data.HeroList;
import java.util.ArrayList;
import java.util.Collections;
import miniheroproject.comparators.FightingSkillComparator;
import miniheroproject.comparators.HeightComparator;

/**
 * @author Krypton
 */
public class SortedHeroes {
    
    private final HeroList heroes = new HeroList();
    private final ArrayList<HeroCard> heroList = heroes.getHeroes();
    private final HeightComparator height = new HeightComparator();
    private final FightingSkillComparator fightingSkills = new FightingSkillComparator();
    private final SpeedComparator speed = new SpeedComparator();
    
    
    public ArrayList<HeroCard> alphaOrderList() {
        
        ArrayList<HeroCard> list = heroList;
        Collections.sort(list);
        
        return list;
    }
    
    public ArrayList<HeroCard> heightOrderList() {
        
        ArrayList<HeroCard> list = heroList;
        Collections.sort(list);
        Collections.sort(list, height);
        
        return list;
    }
    
    public ArrayList<HeroCard> speedOrderList() {
        
        ArrayList<HeroCard> list = heroList;
        Collections.sort(list);
        Collections.sort(list, speed);
        
        return list;
    }
    
    public ArrayList<HeroCard> fightingSkillOrderList() {
        
        ArrayList<HeroCard> list = heroList;
        Collections.sort(list);
        Collections.sort(list, fightingSkills);
        
        return list;
    }
    
    
    
}
