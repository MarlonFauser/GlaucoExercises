package beginner7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner7Test {

	@Test
	public void test() {
		ArrayOrdem preencher = new ArrayOrdem();
		preencher.preencher(5);
		assertTrue (2 == preencher.getArrayPreenchida()[14]);
	}

}
