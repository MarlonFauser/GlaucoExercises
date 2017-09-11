package intermediary3;
import java.util.Scanner;

public class Intermediary3Main {

		public static void main(String [] args) {
			
	   	 Scanner ler = new Scanner(System.in);
	   	 Intermediary3 inter = new Intermediary3();
	   	 
	   	 System.out.println("Digite uma frase ou palavra: ");
	     inter.setText(ler.nextLine());
	     
	   	 System.out.println(inter.getNova());
		}
	}
