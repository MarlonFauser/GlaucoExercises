package beginner8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner8Test {

	@Test
	public void test() {
		Integer n = 523;
		Beginner8 e = new Beginner8() ;
		assertEquals ( "quinhentos e vinte e tr�s", e.getExtenso(n.toString()));
		
	}

}
