package strings1120;

import java.util.Scanner;

public class Strings1120Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Strings1120 string = new Strings1120();
		System.out.println("Digite um número");
		string.setNumber(ler.nextLine());
		System.out.println("Digite uma string de números");
		string.setStringNumber(ler.nextLine());
		System.out.println("String Formatada: " + string.getStringNumber());
	}
}
