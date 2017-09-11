package beginner2;

public class Vendedor {
    private String nome;
    private int salarioF;
    private int totalV;
    private int percent;
    
    public void setNome(String nome) {
   	 this.nome = nome;
    }
    public void setSalarioF(int salarioF) {
   	 this.salarioF = salarioF;
    }
    public void setTotalV(int totalV) {
   	 this.totalV = totalV;
    }
    public int getPercent() {
   	 return percent = (int) (this.totalV * 0.15);
    }
}
