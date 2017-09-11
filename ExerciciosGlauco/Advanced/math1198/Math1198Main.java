package math1198;
import java.util.Scanner;
public class Math1198Main {
public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	Math1198 math = new Math1198();
	System.out.println("Digite o primeiro número: ");
	math.setNumero1(ler.nextInt());
	System.out.println("Digite o segundo número: ");
	math.setNumero2(ler.nextInt());
	
	System.out.println("Diferença entre os números: " + math.getResult());
	
}
}
