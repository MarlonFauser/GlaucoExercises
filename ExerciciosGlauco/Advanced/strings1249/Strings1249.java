package strings1249;
import java.text.Normalizer;
public class Strings1249 {
	    private String frased,frasec = "", alfabeto = "abcdefghijklmnopqrstuvwxyz", simbolos="0123456789'$%*()-_=+,.;:?/!";
	    private int chave, tipo;

	    public String cripto(int chave, int tipo){
	        frasec = "";
	        frased = frased.toLowerCase();
	        frased = (Normalizer.normalize(frased, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")) + " ";

	        for (int i = 0; i < getFrased().length(); i++) {
	            if ((char) frased.charAt(i) == 32){frasec += " ";}
	            if ((char) frased.charAt(i) == 13){frasec += "\n";}

	            for (int j = 0; j < alfabeto.length(); j++) {
	                if (getFrased().charAt(i) == simbolos.charAt(j))
	                            frasec += simbolos.charAt(j);

	                else if (getFrased().charAt(i) == alfabeto.charAt(j)) {
	                    if (tipo == 1){//CRIPTOGRAFAR                    
	                        frasec += alfabeto.charAt((j + chave) % alfabeto.length());}
	                    else if (tipo == 2){//DESCRIPTOGRAFAR
	                        if ((j-chave) >= 0)
	                            frasec += alfabeto.charAt((j - chave) % alfabeto.length());
	                        else if (((j + chave) % alfabeto.length()) == 0)
	                            frasec += alfabeto.charAt(i);
	                        else
	                            frasec += alfabeto.charAt((j - chave + alfabeto.length()) % alfabeto.length());
	                    }
	                }     
	            }
	        }
	       return frasec;
	      
	    } 

	    public String getFrased() {
	        return frased;
	    }


	    public void setFrased(String frased) {
	        this.frased = frased;
	    }

	}
