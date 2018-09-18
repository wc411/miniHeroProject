package miniheroproject.gui;

import java.util.ArrayList;
import miniheroproject.data.*;
import miniheroproject.gui.*;


/**
 * @author Krypton
 */
public class ButtonEvents {

    private final HeroList heroList = new HeroList();
    private  ArrayList<HeroCard> getImage = heroList.getHeroes();
    private final SortedHeroes sortedList = new SortedHeroes();

    private String imglink = "/miniheroproject/gui/img/";
    private int index = 0;
    private int lastIndex = getImage.size() - 1;
    
    void exit() {
        System.exit(0);
    }

    String first() {
        index = 0;
        String imgurl = imglink + getImage.get(index).getImg();
        
        return imgurl;
    }

    String next() {
        index++;
        if(index > lastIndex) index = lastIndex;
        String imgurl = imglink + getImage.get(index).getImg();
        return imgurl;
    }

    String prev() {
        index--;
        if(index < 0) index = 0;
        String imgurl = imglink + getImage.get(index).getImg();
        return imgurl;
    }
    
    String last() {
        index = lastIndex;
        String imgurl = imglink + getImage.get(index).getImg();
        return imgurl;
    }
    
    String gettitle() {
        String title = getImage.get(index).getTitle();
        return title;
    }
    
    String getrealName() {
        String realName = getImage.get(index).getRealName();
        return realName;
    }
    
    String getbackStory() {
        String backStory = getImage.get(index).getBackStory();
        return backStory;
    }
    
    String getheight() {
        int height = getImage.get(index).getHeight();
        if(height == 0) return "N/A";
        else return "" + height;
    }
    
    String getintel() {
        String intel = "" + getImage.get(index).getIntelligence();
        return intel;
    }
    
    String getstr() {
        String str = "" + getImage.get(index).getStrength();
        return str;
    }
    
    String getspd() {
        String spd = "" + getImage.get(index).getSpeed();
        return spd;
    }
    
    String getagi() {
        String agi = "" + getImage.get(index).getAgility();
        return agi;
    }
    
    String getfs() {
        String fs = "" + getImage.get(index).getFightingSkills();
        return fs;
    }
    
    void sortTitle() {
        getImage = sortedList.alphaOrderList();
    }
    void sortHeight() {
        getImage = sortedList.heightOrderList();
    }
    void sortSpeed() {
        getImage = sortedList.speedOrderList();
    }
    void sortFighting() {
        getImage = sortedList.fightingSkillOrderList();
    }
    
}
