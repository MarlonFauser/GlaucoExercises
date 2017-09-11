
package beginner5;

public class ArrayPreenchido1 {
    private int[] multiplicador = new int[1000];
    private int num;

    public void setMultiplicador(int[] multiplicador) {
   	 this.multiplicador = multiplicador;
    }
    public void setNum(int num) {
   	 this.num = num;
    }
    public void preencherOArray() {
   	 for (int i = 0; i < multiplicador.length; i++) {
   		 this.multiplicador[i] =  i * this.num;
   	 }
    }
    public int[] getMultiplicador() {
   	 return multiplicador;
    }
    public int getNum() {
   	 return num;
    }

}
