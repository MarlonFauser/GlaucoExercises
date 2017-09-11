
package beginner9;

import java.util.Scanner;

public class ContadorDeNotasMain {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		ContadorDeNotas cont = new ContadorDeNotas();
		cont.contaNotas(ler.nextInt());

	}

}
