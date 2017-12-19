package sk.balaz.friworld;

/**
 * Represents user commands used in the game.
 * For example "USE", "UP", "DOWN", "EXIT"
 * 
 * @author tomas.balaz
 *
 */
public class Command {
	
	/* Command name */
	private String name;
	
	/* Command parameter */
	private String parameter;
	
	/* Checks if command is defined in game commands */
	private boolean isDefined = false;
	
	/**
	 * Creates command with name and parameter.
	 * 
	 * @param name - Command name
	 * @param parameter - Command parameter
	 */
	public Command(String name, String parameter) {
		this.name = name;
		this.parameter =  parameter;
	}
	
	/**
	 * Returns Command name.
	 * 
	 * @return Command name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns Command parameter.
	 * 
	 * @return Command parameter
	 */
	public String getParameter() {
		return parameter;
	}
	
	/**
	 * Checks if command is defined in game commands.
	 * 
	 * @return True if command is defined in game commands, otherwise false.
	 */
	public boolean isDefined() {
		return isDefined;
	}

	/**
	 * Sets isDefined param to true if command  is defined in game commands.
	 * 
	 * @param isDefined True if command  is defined in game commands, otherwise false.
	 */
	public void setIsDefined(boolean isDefined) {
		this.isDefined = isDefined;
	}

	/**
	 * Checks if command has stored parameter.
	 * 
	 * @return True if command has stored parameter, otherwise false.
	 */
	public boolean hasParameter() {
		return parameter != null;
	}
}
