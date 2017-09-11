package beginner6;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner6Test {

	@Test
	public void test() {
	 	 SomaImpares impar = new SomaImpares();
	 	impar.setSoma(12);
	 	impar.setFim(15);
	 	impar.conta();
	 	assertTrue (28 == impar.getResult());
	}

}
