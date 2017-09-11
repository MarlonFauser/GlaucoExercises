package intermediary4;

public class Intermediary4 {
private int number;

public int setNumber (int number){
	this.number = number;
	return number;
}
public String getStringNumber() {
	String sb = Integer.toBinaryString(this.number);
	return sb;
}
}
