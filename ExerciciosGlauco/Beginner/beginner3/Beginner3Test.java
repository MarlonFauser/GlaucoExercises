package beginner3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner3Test {

	@Test
	public void test() {
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.setCirc(100);
		assertTrue(31415.926535897932 == circunferencia.getArea());
	}

}
