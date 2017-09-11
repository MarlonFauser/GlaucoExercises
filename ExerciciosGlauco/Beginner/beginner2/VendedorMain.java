package beginner2;

import java.util.Scanner;

public class VendedorMain {

    public static void main(String[] args) {

   	 Scanner ler = new Scanner(System.in);
   	 Vendedor vendedor = new Vendedor();
   	 
   	 System.out.println("Digite o nome: ");
   	 vendedor.setNome(ler.next());
   	 System.out.println("Salario fixo: ");
   	 vendedor.setSalarioF(ler.nextInt());
   	 System.out.println("Venda total: ");
   	 vendedor.setTotalV(ler.nextInt());
   	 
   	 System.out.println("O percentual de vendas é: " + vendedor.getPercent());
    }

}
