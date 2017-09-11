package intermediary4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intermediary4Test {

	@Test
	public void test() {
		Intermediary4 inter = new Intermediary4();
		inter.setNumber(19);
		System.out.println(inter.getStringNumber());
		assertEquals ("10011", inter.getStringNumber());
	}
	@Test
	public void test2() {
		Intermediary4 inter = new Intermediary4();
		inter.setNumber(122);
		System.out.println(inter.getStringNumber());
		assertEquals ("1111010", inter.getStringNumber());
	}

}
