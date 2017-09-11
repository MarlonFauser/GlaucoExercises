package beginner9;

public class ContadorDeNotas {
	
	private int qtdNota100;
	private int qtdNota50;
	private int qtdNota20;
	private int qtdNota10;
	private int qtdNota5;
	private int qtdNota2;
	private int qtdNota1;
	
	public void contaNotas(int valorSaque) {
		
		while (valorSaque >= 100) {
			valorSaque = valorSaque - 100;
			qtdNota100++;
		}
		while (valorSaque >= 50) {
			valorSaque = valorSaque - 50;
			qtdNota50++;
		}
		while (valorSaque >= 20) {
			valorSaque = valorSaque - 20;
			qtdNota20++;
		}
		while (valorSaque >= 10) {
			valorSaque = valorSaque - 10;
			qtdNota10++;
		}
		while (valorSaque >= 5) {
			valorSaque = valorSaque - 5;
					qtdNota5++;
		}
		while (valorSaque >= 2) {
			valorSaque = valorSaque - 2;
					qtdNota2++;
		}
		while (valorSaque >= 1) {
			valorSaque = valorSaque - 1;
					qtdNota1++;
		}
		System.out.println("Notas de 100: " + qtdNota100 + "\nNotas de 50: "
				+ qtdNota50 + "\nNotas de 20: " + qtdNota20 + "\nNotas de 10: "
				+ qtdNota10 + "\nNotas de 5: "+qtdNota5 + "\nNotas de 2: "
				+ qtdNota2 + "\nNotas de 1: "+ qtdNota1);
	}
	
	public int getQtdNota100() {
		return qtdNota100;
	}

	public int getQtdNota50() {
		return qtdNota50;
	}

	public int getQtdNota20() {
		return qtdNota20;
	}

	public int getQtdNota10() {
		return qtdNota10;
	}

	public int getQtdNota5() {
		return qtdNota5;
	}

	public int getQtdNota2() {
		return qtdNota2;
	}

	public int getQtdNota1() {
		return qtdNota1;
	}

}
