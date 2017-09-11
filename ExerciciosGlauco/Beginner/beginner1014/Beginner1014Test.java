package beginner1014;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner1014Test {

	@Test
	public void test() {
Consumo consumo = new Consumo();
		consumo.setX(500);
		consumo.setY(35);
		assertTrue (14.285714285714286 == consumo.getCons());
	}

}
