package beginner1013;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner1013Test {

	@Test
	public void test() {
	 	 Melhor melhor = new Melhor();
	   	 melhor.setNum1(71);
	   	 melhor.setNum2(84);
	   	 assertTrue (84 == melhor.getMaiorAB());
	}

}
