package math1161;

import java.util.Scanner;
public class Math1161Main {
	
public static void main (String[] args) {
	Scanner ler = new Scanner (System.in); 
		Math1161 math = new Math1161 ();
		System.out.println("Digite um número: ");
		math.setNumero1(ler.nextInt());
		System.out.println("Digite outro número: ");
		math.setNumero2(ler.nextInt());
	System.out.println(math.getNumero1() + "! + " + math.getNumero2() + "! = " + math.fatorial());
}
}
