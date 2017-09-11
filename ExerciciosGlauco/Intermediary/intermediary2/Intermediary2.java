package intermediary2;

public class Intermediary2 {
    private String nome;
    
    public void setNome(String nome) {
    	String nova1;
    	String nova = nome.replace(" ", "");
    	 nova1 = nova.toLowerCase();
       	 this.nome = nova1;
        }
    
public String getNome() {
	
   	 return nome;
    }
  
public static boolean ePalindromo(String palavra) {
	int meio = palavra.length() / 2;
	for (int i = 0; i < meio; i++) {
    	if (palavra.charAt(i) != palavra.charAt(palavra.length()-1 - i)) {
        	return false;
    	}
	}
	return true;
}
public static boolean ePalindromo2(String palavra) {
	return palavra.equals(new StringBuilder(palavra).reverse().toString());
}

public void trata(){
	String passa;
	passa = this.nome;
    passa = passa.replaceAll("[ÂÀÁÄÃ]","A");  
    passa = passa.replaceAll("[âãàáä]","a");  
    passa = passa.replaceAll("[ÊÈÉË]","E");  
    passa = passa.replaceAll("[êèéë]","e");  
    passa = passa.replaceAll("ÎÍÌÏ","I");  
    passa = passa.replaceAll("îíìï","i");  
    passa = passa.replaceAll("[ÔÕÒÓÖ]","O");  
    passa = passa.replaceAll("[ôõòóö]","o");  
    passa = passa.replaceAll("[ÛÙÚÜ]","U");  
    passa = passa.replaceAll("[ûúùü]","u");  
    passa = passa.replaceAll("Ç","C");  
    passa = passa.replaceAll("ç","c");   
    passa = passa.replaceAll("[ýÿ]","y");  
    passa = passa.replaceAll("Ý","Y");  
    passa = passa.replaceAll("ñ","n");  
    passa = passa.replaceAll("Ñ","N");  
    passa = passa.replaceAll("'","");  
    passa = passa.replaceAll("<","");  
    passa = passa.replaceAll(">","");  
    passa = passa.replaceAll("|","");  
    passa = passa.replaceAll("-","");  
    passa = passa.replaceAll("~","");  
    passa = passa.replaceAll("^","");
    passa = passa.replaceAll(",","");  
    passa = passa.replaceAll("!","");
    
    
   this.nome = passa;
   System.out.println(this.nome);
    

}


}
