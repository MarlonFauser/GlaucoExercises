package intermediary1;

import java.util.Scanner;

public class Intermediary1Main {

    public static void main(String[] args) {
    	Scanner ler = new Scanner (System.in);
    	Intermediary1 inter = new Intermediary1 ();
    	inter.setNome(ler.nextLine());
    	inter.equacao();
    	for (int i = 0; i <= inter.returnJ(); i++) {
    	System.out.println((i+1) + "ª palavra : " + inter.getNumero()[i]);
    	}
    }
}
