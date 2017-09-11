package beginner1004;

import java.util.Scanner;

public class ProdutoSimplesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ProdutoSimples produtosimples = new ProdutoSimples();
		
		System.out.println("Digite um número: ");
		produtosimples.setNum1(ler.nextInt());
		System.out.println("Digite outro número: ");
		produtosimples.setNum2(ler.nextInt());
		
		System.out.println("O produto dessa multiplicação é: " + produtosimples.getProd());
	}

}

