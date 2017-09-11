package beginner4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class IntervaloDataMain {

	public static void main(String[] args) throws ParseException {
		String dateFormat = "dd/MM/yyyy";
		
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Data Inicial: " );
		 String  txtDate = ler.nextLine();
		 
		 IntervaloData intervalo = new IntervaloData();
		 Date data1 = new SimpleDateFormat( dateFormat ).parse(txtDate);
		 intervalo.setDataInicial(data1);

		 
		 System.out.println("Data Final: " );
		 txtDate = ler.nextLine();
		 Date  data2 = new SimpleDateFormat( dateFormat ).parse(txtDate);
	     intervalo.setDataFinal(data2);
	     /************CHAMA A FUNÇÃO PARA CALCULAR A DIFERENÇA*****************/
	     intervalo.diferencaEmDias();


    }
}
