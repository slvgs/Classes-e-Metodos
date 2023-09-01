package classes_metodos;

public class DataTeste {
	public static void main(String[] args) {
		
		Data primeiroAniversario = new Data(); 
		var segundoAniversario = new Data();
		
		
		
		primeiroAniversario.dia = 9;
		primeiroAniversario.mes = "Fevereiro";
		primeiroAniversario.ano =2001;
		
		segundoAniversario.dia = 06;
		segundoAniversario.mes = "Fevereiro";
		segundoAniversario.ano = 2006;
		
		var juncao = primeiroAniversario.dia + " de " + primeiroAniversario.mes + " de "+ primeiroAniversario.ano;
		var juncao2 = segundoAniversario.dia + " de " + segundoAniversario.mes + " de " + segundoAniversario.ano;
		
		System.out.println(juncao + "\n" + juncao2);
		
		
		
		
	}

}
