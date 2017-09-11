package beginner4;

import java.util.Date;

public class IntervaloData {
    private int diferencaEmDias;
	Date dataInicial ;
	Date dataFinal;
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public int diferencaEmDias() {
		this.diferencaEmDias = (int) ( (getDataFinal().getTime() - getDataInicial().getTime()) / (1000 * 60 * 60 * 24) );
		System.out.println("Diferença entre os dias: " + diferencaEmDias);
		return this.diferencaEmDias;
	}
	
	 
	
	
}
