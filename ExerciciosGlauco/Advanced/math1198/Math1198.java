package math1198;

public class Math1198 {
private int numero1;
private int numero2;
private int result;

public int getNumero1() {
	return numero1;
}
public void setNumero1(int numero1) {
	this.numero1 = numero1;
}
public int getNumero2() {
	return numero2;
}
public void setNumero2(int numero2) {
	this.numero2 = numero2;
}
public int getResult() {
	if ((this.numero1 - this.numero2) < 0) {
	result = (this.numero1 - this.numero2) * -1;
	}
	else {
		result = this.numero1 - this.numero2;
	}
	return result;
}
public void setResult(int result) {
	this.result = result;
}

}
