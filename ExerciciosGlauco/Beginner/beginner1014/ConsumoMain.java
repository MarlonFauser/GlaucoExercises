package beginner1014;


import java.util.Scanner;

public class ConsumoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Consumo consumo = new Consumo();
		
		System.out.println("Digite a distância percorrida: ");
		consumo.setX(ler.nextInt());
		System.out.println("Digite o total de combustível consumido: ");
		consumo.setY(ler.nextDouble());
		
		System.out.println("A média de consumo é: " + consumo.getCons() + " km/l.");
	}

}
