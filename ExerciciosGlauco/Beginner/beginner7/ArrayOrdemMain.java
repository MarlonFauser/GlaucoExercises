package beginner7;

import java.util.Scanner;

public class ArrayOrdemMain {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayOrdem preencher = new ArrayOrdem();

		preencher.preencher(ler.nextInt());
		
		ler.close();
		int[] arrayFull = preencher.getArrayPreenchida();
		int j = 0;
		for (int i = 0; i < arrayFull.length; i++) {
			j++;
			System.out.println("[" + j + "]" + " -> " + arrayFull[i]);
		}
	}

}
