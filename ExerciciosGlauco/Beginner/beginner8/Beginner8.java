package beginner8;

public class Beginner8 {

   private String trioextenso[][]={
   	{"dummy", "um", "dois", "três", "quatro", "cinco", "seis", "sete",
    	"oito", "nove"},
   	{"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis",
    	"dezessete", "dezoito", "dezenove"},
   	{"dummy", "dummy", "vinte", "trinta", "quarenta",
    	"cinquenta", "sessenta", "setenta", "oitenta", "noventa"},
   	{"dummy", "cento", "duzentos", "trezentos",
    	"quatrocentos", "quinhentos", "seiscentos",
    	"setecentos", "oitocentos", "novecentos"}
	};

   private String classextenso[] ={
           	"dummy", "mil", "milh", "bilh", "trilh", "quatrilh",
           	"quintilh", "sextilh", "septilh", "octilh",
           	"nonilh", "decilh", "undecilh", "duodecilh",
           	"tredecilh", "quatordecilh", "quindecilh",
           	"sexdecilh", "setedecilh", "octodecilh",
           	"novedecilh", "vigesilh" };

 
   public String adicionar_conjuncao_e(String saida) {

 	 
   	if(saida.charAt(0) == ' ') saida = saida.substring(1) ;

  	 
   	if(saida.charAt(saida.length()-1) == ' ')
       	saida = saida.substring(0, saida.length()-1) ;

	 
   	saida = saida.replaceAll(" ", " e ") ;

   	return saida ;
   }

 	public String escrever_trio_extenso(String trio) {
   	String saida="" ;
   	char u, d, c;

   	u=trio.charAt(2);
   	d=trio.charAt(1);
   	c=trio.charAt(0);

   	if(trio.equals("100")) saida="cem" ;
   	else if(trio.equals("000")) saida="zero" ;
   	else {
       	if(c!='0') saida=trioextenso[3][c-'0'];
       	if(d=='1') saida=saida+" "+trioextenso[1][u-'0'];
       	else {
           	if(d!='0') saida=saida+" "+trioextenso[2][d-'0'];
           	if(u!='0') saida=saida+" "+trioextenso[0][u-'0'] ;
       	}
   	}

   	saida = adicionar_conjuncao_e(saida) ;

   	return saida ;
   }

   private String[] getTriosAoContrario(String numero) {
   	String[] vetorTrios ;
   	int t ;

   	t=numero.length()/3 ;
   	vetorTrios = new String[t] ;

   	for(String s : numero.replaceAll("...", "$0,").split(",")) {
       	vetorTrios[t-1]=s; t-- ;
   	}

   	return vetorTrios ;
   }

   private boolean nao_e_ultimo_trio(String[] vetorTrios, int contador) {
   	return (vetorTrios.length != contador+1) ;
   }

   private boolean trio_a_esquerda_eq_zero(String[] vetorTrios, int contador) {
   	return (vetorTrios[contador+1].equals("000")) ;
   }

	public String getExtenso(String numero) {
    	String saida = "", extensoFinal = "";
    	String[] vetorTrios;
    	int contador = 0;
    	int t ;

    	t = numero.length() % 3;
    	if (t == 1) {
        	numero = "00" + numero;
    	} else if (t == 2) {
        	numero = "0" + numero;
    	}

    	if(numero.equals("000")) return "zero" ;

    	vetorTrios = getTriosAoContrario(numero);

    	for (String trio : vetorTrios) {
        	if (!trio.equals("000")) {
            	saida = escrever_trio_extenso(trio);
            	if (contador > 0) {
                	saida = saida + " " + classextenso[contador];
            	}

            	if (contador > 1) {
                	if (Integer.parseInt(trio)>1) {
                    	saida = saida + "ões";
                	} else {
                    	saida = saida + "ão";
                	}
            	}

            	if (nao_e_ultimo_trio(vetorTrios, contador)) {
                	if (trio_a_esquerda_eq_zero(vetorTrios, contador)) {
                    	saida = " e " + saida;
                	} else if (trio.charAt(0) != '0') {
                    	saida = ", " + saida;
                	} else {
                    	saida = " e " + saida;
                	}
            	}
            	extensoFinal = saida + extensoFinal;
        	}
        	contador++;
    	}

    	return extensoFinal;
	}
}
