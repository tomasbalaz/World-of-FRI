package sk.balaz.friworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CommandTest {
	
	private Command command;
	
	@Before
	public void setUp() {
		command = new Command("UP", "Going UP");
	}
	
	@Test
	public void testGetName() {
		assertEquals("UP", command.getName());
	}
	
	@Test
	public void testGetParameter() {
		assertEquals("Going UP", command.getParameter());
	}
	
	@Test
	public void testHasParameter() {
		assertTrue(command.hasParameter());
	}
}
