package beginner1007;

import java.util.Scanner;

public class DiferencaMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Diferenca diferenca = new Diferenca();
		
		System.out.println("Digite um n�mero: ");
		diferenca.setNum1(ler.nextInt());
		System.out.println("Digite outro n�mero: ");
		diferenca.setNum2(ler.nextInt());
		System.out.println("Digite outro n�mero: ");
		diferenca.setNum3(ler.nextInt());
		System.out.println("Digite outro n�mero: ");
		diferenca.setNum4(ler.nextInt());
		
		System.out.println("A diferen�a entre os n�meros �: " + diferenca.getResult());
	}
}
