package beginner1005;

import java.util.Scanner;

public class MediaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Media media = new Media();
		
		System.out.println("Digite uma nota: ");
		media.setNota1(ler.nextDouble());
		System.out.println("Digite outra nota: ");
		media.setNota2(ler.nextDouble());
		
		System.out.println("A média é: " + media.getMedia());
	}

}
