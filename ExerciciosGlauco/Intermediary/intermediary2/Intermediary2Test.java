package intermediary2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intermediary2Test {

	@Test
	public void test() {
		Intermediary2 inter = new Intermediary2();
		inter.setNome ("Socorram-me, subi no ônibus em Marrocos");
		inter.trata();
		assertTrue (inter.ePalindromo(inter.getNome()) == true);
	}

}
