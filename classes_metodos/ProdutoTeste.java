package classes_metodos;

import java.util.Scanner;

public class ProdutoTeste {
	
	
	public static void main(String[] args) {	
		//como ProdutoTeste e Produto estão dentro do mesmo Pacote os atributos não precisam ser importados 
		
		
		
		//Produto/Scanner = tipo, ou seja = uma classe define o tipo
		// p1/ entrada = nome da variavel que estamos dando a classe/tipo instanciada 
		// new = constructor 
		//Produto/Scanner = chamando novamente o onstructor que tem o mesmo nome da classe, instanciando-os. 
		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		
		//outra forma de instaciar o Produto 
		var p2 = new Produto();
		
		
		//podemos buscar os atributos de Produto pela notação de ponto 
		p1.name = "Notebook";
		p1.preco = 4000.30;
		p1.desconto = 0.25;
		
		
		p2.name = "Caneta Preta";
		p2.preco = 15.90;
		p2.desconto = 0.30;
		
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = R$%.2f.", mediaDoCarrinho);
	}

	
	
	
}
