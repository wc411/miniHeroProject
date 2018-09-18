
package miniheroproject;

import miniheroproject.navigation.ConsoleMenuDisplay;
import miniheroproject.gui.HeroCardGui;
/**
 * @author Krypton
 */
public class MiniHeroProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Text/Console based
        //ConsoleMenuDisplay runApp = new ConsoleMenuDisplay();
        //runApp.consoleMenu();
        
        //GUI based
        HeroCardGui heroGui = new HeroCardGui();
        heroGui.setVisible(true);
        
        
    }
    
}
