package beginner1;

import java.util.Scanner;

public class SomadorMain {

    public static void main(String[] args) {
   	
   	 Scanner ler = new Scanner(System.in);
   	 Somador somador = new Somador();
   	 
   	 System.out.println("Digite um n�mero: ");
   	 somador.setPrimeiro(ler.nextInt());
   	 System.out.println("Digite outro n�mero: ");
   	 somador.setSegundo(ler.nextInt());
   	 
   	 System.out.println("O resultado da soma �: " + somador.getResult());
    }

}
