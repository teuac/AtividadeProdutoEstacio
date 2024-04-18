package br.com.estacio.entities;

import java.util.ArrayList;
import java.util.List;

public class ListaProduto {
	public int listSize = 10;
	List<Produto> produtos = new ArrayList<>(listSize);

	public ListaProduto() {
		
	}
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	public void  imprimeProdutos() {
		for(Produto p : produtos) {
			System.out.println(p);
		}
	}
	
	
	

}
