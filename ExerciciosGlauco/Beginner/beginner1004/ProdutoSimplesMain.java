package beginner1004;

import java.util.Scanner;

public class ProdutoSimplesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ProdutoSimples produtosimples = new ProdutoSimples();
		
		System.out.println("Digite um n�mero: ");
		produtosimples.setNum1(ler.nextInt());
		System.out.println("Digite outro n�mero: ");
		produtosimples.setNum2(ler.nextInt());
		
		System.out.println("O produto dessa multiplica��o �: " + produtosimples.getProd());
	}

}

