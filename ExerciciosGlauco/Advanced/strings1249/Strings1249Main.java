package strings1249;

import java.util.Scanner;

public class Strings1249Main {

public static void main(String[] args){
	Strings1249 string = new Strings1249 ();
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite a frase: ");
	string.setFrased(ler.nextLine());
	
System.out.println("Frase criptografada: " + string.cripto(13, 1));
	
}
}
