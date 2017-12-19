package sk.balaz.friworld;

/**
 * Parses user entered command with attributes and check if command with attributes is defined
 * and creates class {@link Command} .
 * 
 * @author tomas.balaz
 *
 */
public class Parser {
	
	/* Command index in user entered command String */
	private static final int COMMAND_INDEX = 0;
	
	/* Parameter index in user entered command String */
	private static final int PARAMETER_INDEX = 1;
	
	/* String delimits user entered Command and Command parameters  */
	private static final String COMMAND_SPLITTER = " ";
	
	/* Holds all valid game commands */
	private final CommandNames commandNames = new CommandNames();
	
	/**
	 * Parses user entered command to Command and Command parameters.
	 * If command is defined then return {@link Command} class.
	 * If command is undefined then return null.
	 *  
	 * @param command user entered command String
	 * @return @link Command} class.
	 */
	public Command parse(String command) {
		String[] commandAttributes = command.split(COMMAND_SPLITTER);
		String commandName = commandAttributes[COMMAND_INDEX];
		String commandParameter = commandAttributes[PARAMETER_INDEX];
		if(!commandNames.isValidCommand(commandName)) {
			System.err.println("Neznamy command");
			return null;
		}
		return new Command(commandName, commandParameter);
	}

}
