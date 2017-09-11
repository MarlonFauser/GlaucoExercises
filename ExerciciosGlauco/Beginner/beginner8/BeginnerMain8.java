package beginner8;

import java.util.Scanner;

public class BeginnerMain8 {

	public static void main(String[] args) {
   	Scanner ler = new Scanner(System.in);
   	Integer n;

    	Beginner8 e = new Beginner8() ;

   		 System.out.println("Digite o valor: ");
        	n = ler.nextInt();
        	System.out.println(n + " : " + e.getExtenso(n.toString()) + " reais") ;
    	}
	}
