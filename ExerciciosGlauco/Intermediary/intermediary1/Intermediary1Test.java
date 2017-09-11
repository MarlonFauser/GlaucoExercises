package intermediary1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intermediary1Test {

	@Test
	public void test() {
		Intermediary1 inter = new Intermediary1 ();
		inter.setNome("a rapida raposa marrom pulou sobre o cachorro");
		inter.equacao();
		assertTrue (1 == inter.getNumero()[0]);
		assertTrue (6 == inter.getNumero()[1]);
		assertTrue (6 == inter.getNumero()[2]);
		assertTrue (6 == inter.getNumero()[3]);
		assertTrue (5 == inter.getNumero()[4]);
		assertTrue (5 == inter.getNumero()[5]);
		assertTrue (1 == inter.getNumero()[6]);
		assertTrue (8 == inter.getNumero()[7]);
	}
	

}
