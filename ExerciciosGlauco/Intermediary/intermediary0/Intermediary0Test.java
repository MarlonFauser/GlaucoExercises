package intermediary0;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intermediary0Test {

	@Test
	public void test() {
		Intermediary0 cifracesar = new Intermediary0();
		
		String texto = "glauco";
		int chave = 3;
	  	String textoCriptografado = cifracesar.encriptar(chave, texto);
	  	String textoDescriptografado = cifracesar.decriptar(chave, textoCriptografado);
	  	
	  	assertEquals ("jodxfr", textoCriptografado );
	}
	

}
