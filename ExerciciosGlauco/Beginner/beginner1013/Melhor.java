package beginner1013;

public class Melhor {
    private int num1;
    private int num2;
    private int maiorAB;
    
    public void setNum1(int num1) {
   	 this.num1 = num1;
    }
    public void setNum2(int num2) {
   	 this.num2 = num2;
    }
    public int getMaiorAB() {
   	 return maiorAB = ( num1 + num2 + Math.abs(num1 - num2)) / 2;
    }
}
