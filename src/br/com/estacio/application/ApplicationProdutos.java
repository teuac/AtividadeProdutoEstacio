package br.com.estacio.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.estacio.entities.ListaProduto;
import br.com.estacio.entities.Produto;
import br.com.estacio.entities.ProdutoImportado;

public class ApplicationProdutos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ListaProduto lp = new ListaProduto();
		
		Produto prod = new Produto();
		ProdutoImportado prodImp= new ProdutoImportado();
		
		System.out.println("Quantos produtos deseja adicionar");
		int n = sc.nextInt();
		
		if(n <= lp.listSize) {
			for(int i = 0; i<n; i++) {
				System.out.println("Digite o nome do produto");
				prod.setNome(sc.next());
				System.out.println("Digite o preço: ");
				prod.setPreco(sc.nextDouble());
				lp.addProduto(prod);
			}
		}
		else{
			System.out.println("O numero de produtos a serem adicionados excedem o Limite da lista");
		}
		
		System.out.println("Deseja adicionar produtos Importados ? ");
		char resp = sc.next().charAt(0);
		
		if(resp != 'n') {
			System.out.println("Quantos produtos deseja adicionar ?");
			int x = sc.nextInt();
			if(x <= lp.listSize - n) {
				System.out.println("Digite o nome: ");
				prodImp.setNome(sc.next());
				System.out.println("Digite o preço: ");
				prodImp.setPreco(sc.nextDouble());
				System.out.println("Digite o tipo: ");
				prodImp.setTipo(sc.nextInt());
				
				prod = prodImp;
				lp.addProduto(prod);
			}
		}
		else {
			prod.toString();
		}
		
		System.out.println();
		System.out.println();
		lp.imprimeProdutos();
		System.out.println("----------------------\n");
		prod.toString();
		System.out.println("----------------------\n");
		prodImp.toString();
		
	}
		

}
