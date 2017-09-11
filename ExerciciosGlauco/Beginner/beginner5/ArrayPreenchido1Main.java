package beginner5;

import java.util.Scanner;

public class ArrayPreenchido1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ArrayPreenchido1 array = new ArrayPreenchido1();

		System.out.println("Digite um número: ");
		array.setNum(ler.nextInt());

		array.preencherOArray();

		int[] valores = array.getMultiplicador();

		for (int i = 0; i < valores.length; i++) {
			System.out.println(array.getNum() + " [" + i + "]  -> " + valores[i]);
		}

	}

}
