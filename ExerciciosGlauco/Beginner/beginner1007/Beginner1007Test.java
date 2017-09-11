package beginner1007;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner1007Test {

	@Test
	public void test() {
Diferenca diferenca = new Diferenca();
		diferenca.setNum1(5);	
     	diferenca.setNum2(6);
		diferenca.setNum3(-7);
		diferenca.setNum4(8);
		assertTrue (86 == diferenca.getResult());
	}

}
