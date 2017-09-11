package beginner7;

public class ArrayOrdem {

	private int[] arrayPreenchida = new int[1000];

	public int[] getArrayPreenchida() {
		return arrayPreenchida;
	}

	public void setArrayPreenchida(int[] arrayPreenchida) {
		this.arrayPreenchida = arrayPreenchida;
	}

	public void preencher(int numMaximo) {
		int i = 0;
		int j = 0;
		while (i < arrayPreenchida.length) {
			arrayPreenchida[i] = j;
			i++;
			j++;

			if (j > numMaximo) {
				j = 0;
			}
		}
	}

}
