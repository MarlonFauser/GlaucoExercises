package intermediary3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intermediary3Test {

	@Test
	public void test() {
		Intermediary3 inter = new Intermediary3();
		inter.setText("A vela apagou");
		assertEquals ("vlpg", inter.getNova());
	}

}
