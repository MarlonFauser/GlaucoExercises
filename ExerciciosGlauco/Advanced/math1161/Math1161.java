package math1161;

public class Math1161 {
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
public int fatorial () {
	if (this.numero1 == 0) {
		this.numero1 = 1;
	}
	for (int i = this.numero1-1; i > 0; i--) {
		this.numero1 = i * this.numero1;
	}
	if (this.numero2 == 0) {
		this.numero2 = 1;
	}
	for (int i = this.numero2-1; i > 0; i--) {
		this.numero2 = i * this.numero2;
	}
	this.result = this.numero1 + this.numero2;
	return this.result;
}

}
