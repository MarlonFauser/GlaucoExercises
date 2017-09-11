package beginner1005;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner1005Test {

	@Test
	public void test() {
	Media media = new Media();
		media.setNota1(10);
		media.setNota2(9);
		assertTrue (9.5 == media.getMedia());
	}

}
