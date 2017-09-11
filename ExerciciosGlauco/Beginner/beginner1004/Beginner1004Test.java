package beginner1004;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner1004Test {

	@Test
	public void test() {
	ProdutoSimples produtosimples = new ProdutoSimples();
		produtosimples.setNum1(10);
		produtosimples.setNum2(120);
		assertTrue (1200 == produtosimples.getProd());
	}

}
