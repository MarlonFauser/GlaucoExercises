package beginner6;
import java.util.Scanner;

public class SomaImparesMain {

    public static void main(String[] args) {
   	 
   	 Scanner ler = new Scanner(System.in);
   	 SomaImpares impar = new SomaImpares();
   	 
   	 System.out.println("Digite o menor número: ");
   	 impar.setSoma(ler.nextInt());
   	 System.out.println("Digite o maior número: ");
   	 impar.setFim(ler.nextInt());
   	 impar.conta();
   	 System.out.println("Total = " + impar.getResult());
    }

}
