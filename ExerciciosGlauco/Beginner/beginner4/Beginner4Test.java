package beginner4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static org.junit.Assert.*;

import org.junit.Test;

public class Beginner4Test {

	@Test
	public void test() throws ParseException {
		String dateFormat = "dd/MM/yyyy";
		 IntervaloData intervalo = new IntervaloData();
		 String  txtDate = "11/10/2011" ;
		 Date data1 = new SimpleDateFormat( dateFormat ).parse(txtDate);
		 intervalo.setDataInicial(data1);
		 txtDate = "15/11/2018";
		 Date  data2 = new SimpleDateFormat( dateFormat ).parse(txtDate);
	     intervalo.setDataFinal(data2);
	     
	     assertTrue (2591 == intervalo.diferencaEmDias());
	}

}
