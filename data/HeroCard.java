package miniheroproject.data;

/**
 * @author Krypton
 */
public class HeroCard implements Comparable<HeroCard> {

    /**
     * Title: Name of the hero 
     * RealName: The hero's real name 
     * BackStory: A bit of background story of the hero
     */
    private final String title, realName, backStory, imglink;

    /**
     * Height: The hero's height in cm 
     * Intelligence: The hero's intelligence
     * Strength: The hero's strength 
     * Speed: The hero's speed 
     * Agility: The hero's agility 
     * FightingSkills: Hero's fighting skills
     */
    private final int height, intelligence, strength, speed, agility, fightingSkills;

    /**
     * A class constructor that initializes all attributes fields below
     * 
     * @param t the name of the hero
     * @param rN the real name of the hero
     * @param h hero's height
     * @param i hero's intelligence
     * @param str hero's strength
     * @param spd hero's speed
     * @param agi hero's agility
     * @param fS hero's fighting skill
     * @param bS hero's back story
     */
    public HeroCard(String t, String rN, int h, int i, int str,
            int spd, int agi, int fS, String bS, String img) {
        title = t;
        realName = rN;
        height = h;
        intelligence = i;
        strength = str;
        speed = spd;
        agility = agi;
        fightingSkills = fS;
        backStory = bS;
        imglink = img;
    }

    
    /////////////////////////Get hero attributes////////////////////////////
    /**
     * A retriever for the name attribute
     *
     * @return the name of the hero as a string
     */
    public String getTitle() {
        return title;
    }

    /**
     * A retriever for the real name attribute
     *
     * @return the real name of the hero as a string
     */
    public String getRealName() {
        return realName;
    }

    /**
     * A retriever for the height attribute
     *
     * @return the height of the hero as an integer
     */
    public int getHeight() {
        return height;
    }

    /**
     * A retriever for the intelligence attribute
     *
     * @return the intelligence of the hero as an integer
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * A retriever for the strength attribute
     *
     * @return the strength of the hero as an integer
     */
    public int getStrength() {
        return strength;
    }

    /**
     * A retriever for the speed attribute
     *
     * @return the speed of the hero as an integer
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * A retriever for the agility attribute
     *
     * @return the agility of the hero as an integer
     */
    public int getAgility() {
        return agility;
    }

    /**
     * A retriever for the fighting skills attribute
     *
     * @return the fighting skills of the hero as an integer
     */
    public int getFightingSkills() {
        return fightingSkills;
    }
    
    /**
     * A retriever for the back story attribute
     *
     * @return the back story of the hero as a string
     */
    public String getBackStory() {
        return backStory;
    }
    
    public String getImg() {
        return imglink;
    }
    
    /**
     * A sorting for this class on a alphabetic ordering
     *
     * @param c Is another hero object to compare with this one.
     */
    public int compareTo(HeroCard c) {

        return this.getTitle().compareTo(c.getTitle());
    }
    
    /**
     * A string representation of this object 
     * that includes all the attribute values
     */
    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb.append("-------------------------------------------------------------"
                + "-------------------------------------------------------------\n");
        sb.append("Title: \t\t\t" + this.getTitle() + "\n");
        sb.append("Real name: \t\t" + this.getRealName() + "\n");
        if(this.getHeight() == 0) sb.append("Height (cm): \t\t" + "N/A" + "\n");
        else sb.append("Height (cm): \t\t" + this.getHeight() + "\n");
        sb.append("Intelligence: \t\t" + this.getIntelligence() + "\n");
        sb.append("Strength: \t\t" + this.getStrength() + "\n");
        sb.append("Speed: \t\t\t" + this.getSpeed() + "\n");
        sb.append("Agility: \t\t" + this.getAgility() + "\n");
        sb.append("Fighting skills: \t" + this.getFightingSkills() + "\n");
        sb.append("Back story: \t\t" + this.getBackStory() + "\n");
        sb.append("-------------------------------------------------------------"
                + "-------------------------------------------------------------\n");

        return sb.toString();
    }
}
