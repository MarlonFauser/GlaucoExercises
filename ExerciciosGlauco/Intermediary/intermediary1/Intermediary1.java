package intermediary1;

public class Intermediary1 {
	private int j;
	private String nome;
	private int[] numero = new int[1000];

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void equacao() {
		int total = -1;
		this.j = 0;
		for (int i = 0; i < this.nome.length(); i++) {
			char ch = this.nome.charAt(i);
			String x1 = String.valueOf(ch);
			total++;
			if (x1.equalsIgnoreCase(" ")) {
				numero[j] = total;
				j++;
				total = -1;
			}
		}
		numero[j] = total + 1;
	}

	public int[] getNumero() {
		return numero;
	}

	public int returnJ() {
		return this.j;
	}

}

