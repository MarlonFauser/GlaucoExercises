package strings1249;

import static org.junit.Assert.*;

import org.junit.Test;

public class Strings1249Test {

	@Test
	public void test() {
		Strings1249 string = new Strings1249 ();
		string.setFrased("This is a test message.");
		String tester = string.cripto(13, 1);
		assertEquals ("guvf vf n grfg zrffntr. ", tester);
	}

}
