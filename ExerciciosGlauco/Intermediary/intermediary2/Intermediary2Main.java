package intermediary2;

import java.util.Scanner;

public class Intermediary2Main {
    
public static void main(String [] args) {
    Intermediary2 inter = new Intermediary2();
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite uma frase: ");
     inter.setNome(ler.nextLine());
     inter.trata();
     if (inter.ePalindromo(inter.getNome()) == true) {
   	  System.out.println("É um palíndromo");
     }
     else {
   	  System.out.println("Não é um palíndromo");
     }
}
}



