package beginner9;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner9Test {

	@Test
	public void test() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (112 == cont.getQtdNota100());
	}
	@Test
	public void test2() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (1 == cont.getQtdNota50());
	}
	@Test
	public void test3() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (0 == cont.getQtdNota20());
	}
	@Test
	public void test4() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (0 == cont.getQtdNota10());
	}
	@Test
	public void test5() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (1 == cont.getQtdNota5());
	}
	@Test
	public void test6() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (1 == cont.getQtdNota2());
	}
	@Test
	public void test7() {
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(11257);
		assertTrue (0 == cont.getQtdNota1());
	}
}
