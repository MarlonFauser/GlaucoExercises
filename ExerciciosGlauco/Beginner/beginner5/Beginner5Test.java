package beginner5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner5Test {

	@Test
	public void test() {
		 
		ArrayPreenchido1 array = new ArrayPreenchido1();
		array.setNum(5);
		array.preencherOArray();
		assertTrue (45 == array.getMultiplicador()[9]);
	}

}
