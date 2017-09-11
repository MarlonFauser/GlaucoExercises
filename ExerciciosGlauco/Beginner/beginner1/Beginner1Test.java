package beginner1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner1Test {

	@Test
	public void test() {
		Somador somador = new Somador();
		somador.setPrimeiro(15);
		somador.setSegundo(26);
		 assertTrue(41 == somador.getResult());
	}

}
