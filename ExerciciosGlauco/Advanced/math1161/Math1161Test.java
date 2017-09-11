package math1161;

import static org.junit.Assert.*;

import org.junit.Test;

public class Math1161Test {

	@Test
	public void test() {
		Math1161 math = new Math1161 ();
		math.setNumero1(7);
		math.setNumero2(7);
		assertTrue (10080 == math.fatorial());
	}

}
