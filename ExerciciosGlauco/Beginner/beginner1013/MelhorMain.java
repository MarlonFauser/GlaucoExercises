package beginner1013;

import java.util.Scanner;

public class MelhorMain {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
   	 Scanner ler = new Scanner(System.in);
   	 Melhor melhor = new Melhor();
   		 
   	 System.out.println("Digite um n�mero: ");
   	 melhor.setNum1(ler.nextInt());
   	 System.out.println("Digite outro n�mero: ");
   	 melhor.setNum2(ler.nextInt());
   	 
   	 System.out.println("O maior n�mero �: " + melhor.getMaiorAB());
    }

}
