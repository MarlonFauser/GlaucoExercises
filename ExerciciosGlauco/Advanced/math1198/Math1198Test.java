package math1198;

import static org.junit.Assert.*;

import org.junit.Test;

public class Math1198Test {

	@Test
	public void test() {
		Math1198 math = new Math1198();
		math.setNumero1(100);
		math.setNumero2(300);
		assertTrue (200 == math.getResult());
	}

}
