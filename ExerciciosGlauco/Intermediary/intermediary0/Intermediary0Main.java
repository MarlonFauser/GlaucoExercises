package intermediary0;

import java.util.Scanner;

public class Intermediary0Main {

public static void main(String[] args){
    Intermediary0 cifracesar = new Intermediary0();
   try {
  	Scanner ler = new Scanner(System.in);
   
  	System.out.println("*****************************************************");
 	 
  	// Informa texto e chave de criptografia
  	System.out.print("Informe o texto a ser criptografado: ");
  	String texto = ler.nextLine();
  	System.out.print("Informe a chave de deslocamento: ");
  	int chave = ler.nextInt();
 	 
  	// Criptografando
  	String textoCriptografado = cifracesar.encriptar(chave, texto);
  	// Descriptografando
  	String textoDescriptografado = cifracesar.decriptar(chave, textoCriptografado);
 	 
  	// Imprimindo no CONSOLE os resultados
  	System.out.println("\n\nTexto criptografado: " + textoCriptografado);
  	System.out.println("Texto descriptografado: " + textoDescriptografado);
 	 
  	System.out.println("*****************************************************");
 	 
   } catch (RuntimeException e) { // Trata erro de digitacao
  	System.out.println("A chave de deslocamento foi informada incorretamente.");
  	System.out.println("Execute o programa novamente e entre com uma chave valida.");
   }
   
}
}

