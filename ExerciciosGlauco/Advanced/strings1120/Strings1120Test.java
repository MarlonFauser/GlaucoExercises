package strings1120;

import static org.junit.Assert.*;

import org.junit.Test;

public class Strings1120Test {

	@Test
	public void test() {

		Strings1120 string = new Strings1120();
		string.setNumber("3");
		string.setStringNumber("123456789");
		assertEquals("12456789", string.getStringNumber());

	}

}
