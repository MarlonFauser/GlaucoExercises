package intermediary3;

public class Intermediary3 {

	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getNova() {
		 String nova = text.replace("a", "");
	   	 nova = nova.replace("e", "");
	   	 nova = nova.replace("i", "");
	   	 nova = nova.replace("o", "");
	   	 nova = nova.replace("u", "");
	   	 nova = nova.replace("A", "");
	   	 nova = nova.replace("E", "");
	   	 nova = nova.replace("I", "");
	   	 nova = nova.replace("O", "");
	   	 nova = nova.replace("U", "");
	   	 nova = nova.replace(" ", "");
		return nova;
	}

}
