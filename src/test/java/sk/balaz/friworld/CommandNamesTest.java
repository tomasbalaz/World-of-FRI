package sk.balaz.friworld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandNamesTest {
	
	private CommandNames commandNames;

	@Before
	public void setUp() {
		commandNames = new CommandNames();
	}

	@Test
	public void testIsValidCommand() {
		assertTrue(commandNames.isValidCommand("UP"));
	}
	
	@Test
	public void testIsInvalidCommand() {
		assertFalse(commandNames.isValidCommand("INVALID_COMMAND"));
	}

}
