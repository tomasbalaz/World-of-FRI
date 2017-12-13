package sk.balaz.friworld;

import java.util.List;

/**
 * Contains all valid commands which are used in Game 
 * and check if entered command is valid.
 * 
 * @author tomas.balaz
 *
 */
public class CommandNames {
	
	/* All valid command names */
    private List<String> commandNames;
    
    /**
     * Initialize all valid commands which are used in Game.
     */
    public CommandNames() {
    	initializeCommandNames();
	}
    
    /**
     * Checks if entered command is valid in game.
     * 
     * @param command Command 
     * @return True if entered command is valid, otherwise false.
     */
    public boolean isValidCommand(String command) {
    	if(command != null) {
    		for (String commandName : commandNames) {
    			if(command.equals(commandName)) {
    				return true;
    			}
    		}	
    	}
    	return false;
    }
    
    /* Initialize all valid commands which are used in Game */
    private void initializeCommandNames() {
    	commandNames.add("UP");
    	commandNames.add("DOWN");
    }

}
