package beginner6;

public class SomaImpares {
    private int soma;
    private int fim;
    private int result;
    
    public void setSoma(int soma) {
   	 this.soma = soma;
    }
    public void setFim(int fim) {
   	 this.fim = fim;
    }
    public void conta(){
   	 for(int i = soma; i <= fim; i++){
   		 if(i % 2 != 0 && i != soma){
   			 this.result = this.result + i;
   		 }
   		 else if ( i % 2 != 0 && i == soma){
   			 this.result = soma;
   		 }
   	 }
    }
    public int getResult() {
   	 return this.result;
    }
    
}

