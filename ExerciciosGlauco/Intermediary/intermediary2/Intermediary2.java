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
    passa = passa.replaceAll("[�����]","A");  
    passa = passa.replaceAll("[�����]","a");  
    passa = passa.replaceAll("[����]","E");  
    passa = passa.replaceAll("[����]","e");  
    passa = passa.replaceAll("����","I");  
    passa = passa.replaceAll("����","i");  
    passa = passa.replaceAll("[�����]","O");  
    passa = passa.replaceAll("[�����]","o");  
    passa = passa.replaceAll("[����]","U");  
    passa = passa.replaceAll("[����]","u");  
    passa = passa.replaceAll("�","C");  
    passa = passa.replaceAll("�","c");   
    passa = passa.replaceAll("[��]","y");  
    passa = passa.replaceAll("�","Y");  
    passa = passa.replaceAll("�","n");  
    passa = passa.replaceAll("�","N");  
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
