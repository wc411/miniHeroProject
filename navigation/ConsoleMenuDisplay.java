package miniheroproject.navigation;

import miniheroproject.data.SortedHeroes;
import miniheroproject.data.HeroList;
import miniheroproject.data.HeroCard;


import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Krypton
 */
public class ConsoleMenuDisplay {

    private final HeroList activeList = new HeroList();
    private final SortedHeroes sortedList = new SortedHeroes();
    private ArrayList<HeroCard> heroList = activeList.getHeroes();
    
    private Scanner input = new Scanner(System.in);
    
    private int index = 0;
    private int userInput;
    private final int lastIDX = heroList.size() - 1;
    
    
    private boolean subMenu, QUIT = false;
    private final int FIRST = 1;
    private final int NEXT = 2;
    private final int PREV = 3;
    private final int LAST = 4;
    private final int SORT = 5;
    private final int TITLE = 6;
    private final int HEIGHT = 7;
    private final int SPEED = 8;
    private final int FIGHT = 9;
    private final int BACK = 0;

    private void menuNav() {
        if (subMenu == false) {
            System.out.println("\nFirst...............1");
            System.out.println("Next................2");
            System.out.println("Previous............3");
            System.out.println("Last................4");
            System.out.println("\nSort................5");
            System.out.println("\nExit................0\n");
        } else if (subMenu == true) {
            System.out.print("-------------------------------------------------------------"
                + "-------------------------------------------------------------\n");
            System.out.println("Enter sorting category:");
            System.out.println("\nTitle...............6");
            System.out.println("Height..............7");
            System.out.println("Speed...............8");
            System.out.println("Fighting Skills.....9");
            System.out.println("\nBack................0");
        }

        System.out.print("\nEnter choice:> ");
        userInput = input.nextInt();
        System.out.println();
    }

    private String heroMenu(int index) {
        String activeHero = heroList.get(index).toString();
        
        return activeHero;
    }
    
    public void consoleMenu() {
        heroList = sortedList.alphaOrderList();
        heroMenu(index);
        System.out.print(heroMenu(index));
        
        menuNav();
        
        while(QUIT != true) {

            if(userInput == BACK)
                if(subMenu == true) subMenu = false;
                else  break;
            else
            if(userInput == FIRST) index = 0;
            else if(userInput == NEXT) index++;
            else if(userInput == PREV) index--;
            else if(userInput == LAST) index = lastIDX;
            else if(userInput == SORT) subMenu = true;
            else if(userInput == TITLE && subMenu == true) {
                heroList = sortedList.alphaOrderList();
                subMenu = false;
            }
            else if(userInput == HEIGHT && subMenu == true) {
                heroList = sortedList.heightOrderList();
                subMenu = false;
            }
            else if(userInput == SPEED && subMenu == true) {
                heroList = sortedList.speedOrderList();
                subMenu = false;
            }
            else if(userInput == FIGHT && subMenu == true) {
                heroList = sortedList.fightingSkillOrderList();
                subMenu = false;
            }
            
            
            if(index > lastIDX) index = lastIDX;
            else if(index < 0) index = 0;
            
            if (subMenu == false) System.out.print(heroMenu(index));
            
            menuNav();
        }
    }
}
