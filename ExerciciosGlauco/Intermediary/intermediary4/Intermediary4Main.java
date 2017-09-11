package intermediary4;
import java.util.Scanner;

public class Intermediary4Main {
	public static void main (String[] args) {
	Scanner ler = new Scanner(System.in);
	Intermediary4 inter = new Intermediary4();
	int number = ler.nextInt();
	inter.setNumber(number);
   
    System.out.println(number + " em binário: " + inter.getStringNumber());
}
}