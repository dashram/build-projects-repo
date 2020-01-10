package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageBuilder {

	@Test
	public void testNameMkyong() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Hello mkyong", obj.getMessage("mkyong"));

	}

	/*
	 * @Test public void testNameEmpty() {
	 * 
	 * MessageBuilder obj = new MessageBuilder();
	 * assertEquals("Please provide a name!", obj.getMessage(" "));
	 * 
	 * }
	 * 
	 * @Test public void testNameNull() {
	 * 
	 * MessageBuilder obj = new MessageBuilder();
	 * assertEquals("Please provide a name!", obj.getMessage(null));
	 * 
	 * }
	 */

}