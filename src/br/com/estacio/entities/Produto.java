package br.com.estacio.entities;

public class Produto {
	private String nome;
	protected Double preco;
	public Produto() {
		
	}
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double calcularImposto() {
		Double imp = 0.0;
		
		if(preco < 100) {
			imp = preco + ((preco / 100) * 5);
		} 
		else if(preco > 100) {
			imp = preco + ((preco / 100) * 10);
		}
		
		return imp;
		
	}
	public String toString() {
		return "Produto: "+ nome +
		" /nPreco: " + preco +
		" /nImposto pago: " + (calcularImposto() - preco)+
		" /n Valor total: "+ calcularImposto();
		
	}
	
	

}
