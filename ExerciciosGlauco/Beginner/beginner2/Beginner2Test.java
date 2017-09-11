package beginner2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner2Test {

	@Test
	public void test() {
		 Vendedor vendedor = new Vendedor();
		 vendedor.setTotalV(400);
		 assertTrue(60 == vendedor.getPercent());
	}

}
