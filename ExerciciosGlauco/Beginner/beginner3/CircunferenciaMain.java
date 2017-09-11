package beginner3;

import java.util.Scanner;

public class CircunferenciaMain {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
   	 Scanner ler = new Scanner(System.in);
   	 Circunferencia circunferencia = new Circunferencia();
   	 
   	 System.out.println("Qual a circunferencia: ");
   	 circunferencia.setCirc(ler.nextDouble());
   	 
   	 System.out.println("A área é: " + circunferencia.getArea());
    }

}
