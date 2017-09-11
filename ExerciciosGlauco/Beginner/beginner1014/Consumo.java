package beginner1014;

public class Consumo {
	private int x;
	private double y;
	private double cons;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getCons() {
		this.cons = this.x / this.y;
		return this.cons;
	}
	
	
}
