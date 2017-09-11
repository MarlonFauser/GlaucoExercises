package strings1120;

public class Strings1120 {
	private String number;
	private String stringNumber;

	public String setNumber(String number) {
		this.number = number;
		return number;
	}
	public String getNumber() {
		return number;
	}
	public String setStringNumber(String stringNumber) {
		this.stringNumber = stringNumber;
		return this.stringNumber;
	}
	public String getStringNumber() {
		this.stringNumber = this.stringNumber.replace(number, "");
		return this.stringNumber;
	}
}
